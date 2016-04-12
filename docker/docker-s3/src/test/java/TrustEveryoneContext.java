import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import org.junit.rules.ExternalResource;

public class TrustEveryoneContext extends ExternalResource {
	@Override
	public void before() throws Throwable {
		SSLContext sslContext = SSLContext.getInstance("TLS");
		TrustManager[] trustManagers = new TrustManager[] { new TrustEveryoneManager() };
		sslContext.init(null, trustManagers, null);
		SSLContext.setDefault(sslContext);
		HttpsURLConnection
				.setDefaultHostnameVerifier((hostname, session) -> true);
	}

	class TrustEveryoneManager implements X509TrustManager {
		@Override
		public void checkClientTrusted(X509Certificate[] chain, String authType)
				throws CertificateException {
		}

		@Override
		public void checkServerTrusted(X509Certificate[] chain, String authType)
				throws CertificateException {
		}

		@Override
		public X509Certificate[] getAcceptedIssuers() {
			return null;
		}
	}
}
