package com.kgisl.spring.Config;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
public class SpringjdbcConfig {
    static {
        System.out.println("JDBC Configuration");
    }
    @Bean
    public DataSource mysqlDataSource() {
        System.out.println("mysqlDataSource Bean created");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(
                "jdbc:mysql://localhost:3306/ebookshop");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        System.out.println(dataSource);
        return dataSource;
    }
}
