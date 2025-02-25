package com.ll.meilisearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MeilisearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeilisearchApplication.class, args);
    }

}
