package com.playstation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@ComponentScan
@EnableAutoConfiguration
public class GameLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameLibraryApplication.class, args);
    }



}