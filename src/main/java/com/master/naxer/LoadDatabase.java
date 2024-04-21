package com.master.naxer;

import com.master.naxer.repository.TextRepository;
import com.master.naxer.repository.Usuario;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(TextRepository repository) {
        return args -> {
            Usuario david = repository.save(new Usuario("David"));
            log.info(String.format("Precargando %s", david));
            Usuario ana = repository.save(new Usuario("Ana"));
            log.info(String.format("Precargando %s", ana));
        };
    }
}