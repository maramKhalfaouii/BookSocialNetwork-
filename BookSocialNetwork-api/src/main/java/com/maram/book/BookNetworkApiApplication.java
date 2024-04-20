package com.maram.book;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

public class BookNetworkApiApplication {

    @EnableJpaAuditing
    public class BookNetworkApi {
        public static void main(String[] args) {
            SpringApplication.run(BookNetworkApi.class, args);
        }

    }
}
