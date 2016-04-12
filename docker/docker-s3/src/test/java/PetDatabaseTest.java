import java.io.IOException;

import org.junit.ClassRule;

import com.amazonaws.services.s3.AmazonS3Client;
import com.google.common.base.Throwables;
import com.palantir.docker.compose.DockerComposition;
import com.palantir.docker.compose.connection.DockerPort;

public class PetDatabaseTest {

	private final DockerComposition dockerComposition = DockerComposition.of(
			"docker-s3/src/test/resources/docker-compose.yml").build();

	@ClassRule
	public static final TrustEveryoneContext ignoreSSLCerts = new TrustEveryoneContext();

	private AmazonS3Client createS3Client() {
		try {
			System.setProperty("com.amazonaws.sdk.disableCertChecking", "true");
			DockerPort s3Port = dockerComposition.portOnContainerWithInternalMapping("s3", 443);
			String s3Endpoint = "https://" + s3Port.getIp() + ":"
					+ s3Port.getExternalPort();
			AmazonS3Client s3Client = new AmazonS3Client();
			s3Client.setEndpoint(s3Endpoint);
			return s3Client;
		} catch (IOException | InterruptedException e) {
			throw Throwables.propagate(e);
		}
	}
}
