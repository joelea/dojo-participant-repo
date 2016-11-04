package cannot.touch;

import org.postgresql.jdbc3.Jdbc3PoolingDataSource;

import javax.sql.DataSource;

public class DataSourceFactory {

    public static DataSource create() {
        Jdbc3PoolingDataSource source = new Jdbc3PoolingDataSource();

        source.setDataSourceName("A Data Source");
        source.setServerName("localhost");
        source.setDatabaseName("postgres");
        source.setPortNumber(5432);
        source.setUser("postgres");
        source.setPassword("mysecretpassword");
        source.setMaxConnections(10);

        return source;
    }
}

