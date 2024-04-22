package com.master.naxer.configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.sql.DataSource;

@Configuration
@EnableAspectJAutoProxy
public class MasterAppConfiguration {

    @Bean
    public DataSource getDataSource() {
        final DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        // Tuve que usar el puerto 3307 porque yo ya tenía otra DB corriendo en el puerto 3306
        dataSourceBuilder.url("jdbc:mysql://localhost:3307/test");
        dataSourceBuilder.username("root");
        dataSourceBuilder.password("admin");
        return dataSourceBuilder.build();
    }
}
