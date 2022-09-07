package org.sg.holdem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class HoldemApplication {

    public static void main(String[] args) {
        SpringApplication.run(HoldemApplication.class, args);
    }

}
