package com.mongosolr;

import com.mongosolr.mongo.dao.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartBuckPocApplication implements CommandLineRunner {

    @Autowired
    private CounterRepository counterRepository;

    public static void main(String[] args) {
        SpringApplication.run(StartBuckPocApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

}
