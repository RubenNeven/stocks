package com.security.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@Configuration
public class DataSourceBean {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    @Primary
    public DataSource getDataSource(){
        return DataSourceBuilder
                .create()
                .url("jdbc:mysql://udemyeazybanking.c3hc1sdbunnd.us-east-2.rds.amazonaws.com:3306/?user=ruben")
                .username("ruben")
                .password("Hazard10")
                .build();
    }
}
