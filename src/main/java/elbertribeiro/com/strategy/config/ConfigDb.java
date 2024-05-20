package elbertribeiro.com.strategy.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@EnableJpaRepositories("elbertribeiro.com.strategy.dao")
@EntityScan("elbertribeiro.com.strategy.model")
@Configuration
public class ConfigDb {
    @Bean
    public DataSource dataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        return builder.setType(EmbeddedDatabaseType.H2)
                .addScript("db/create-schema.sql")
                .addScript("db/create-table.sql")
                .addScript("db/insert.sql")
                .build();
    }
}
