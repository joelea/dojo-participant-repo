package cannot.touch;

import org.postgresql.ds.PGPoolingDataSource;
import org.postgresql.jdbc3.Jdbc3PoolingDataSource;

import javax.sql.DataSource;

public class DataSourceFactory {

    private static final String NAME = "A Data Source";

    public static DataSource create() {
        PGPoolingDataSource existingDataSource = PGPoolingDataSource.getDataSource(NAME);

        if(existingDataSource == null) {
            return createNewDatasource();
        }

        return existingDataSource;
    }

    private static DataSource createNewDatasource() {
        Jdbc3PoolingDataSource source = new Jdbc3PoolingDataSource();

        source.setDataSourceName(NAME);
        source.setServerName("localhost");
        source.setDatabaseName("postgres");
        source.setPortNumber(5432);
        source.setUser("postgres");
        source.setPassword("mysecretpassword");
        source.setMaxConnections(10);

        return source;
    }
}

