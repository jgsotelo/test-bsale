package com.example.bsale.application.persistency;

import io.r2dbc.pool.ConnectionPool;
import io.r2dbc.pool.ConnectionPoolConfiguration;
import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

import static io.r2dbc.spi.ConnectionFactoryOptions.*;

@Configuration
public class MySqlConnectConfig {

    /*@Bean
    public ConnectionFactory connectionFactory() {
        ConnectionFactoryOptions options = ConnectionFactoryOptions.builder()
                .option(DRIVER, "mysql")
                .option(HOST, "mdb-test.c6vunyturrl6.us-west-1.rds.amazonaws.com")
                .option(DATABASE, "bsale_test")
                .option(USER, "bsale_test")
                .option(PORT, 3306)
                .option(CONNECT_TIMEOUT, Duration.ofSeconds(3))
                .option(PASSWORD, "bsale_test")
                .build();
        return ConnectionFactories.get(options);
    }

    @Bean
    public ConnectionPool connectionPool(ConnectionFactory connectionFactory) {
        ConnectionPoolConfiguration config = ConnectionPoolConfiguration
                .builder(connectionFactory)
                .backgroundEvictionInterval(Duration.ofMillis(2000))
                .maxIdleTime(Duration.ofMillis(2000))
                .maxSize(10)
                .build();
        return new ConnectionPool(config);
    }*/
}