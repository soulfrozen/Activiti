package com.hacker.activiti.query;

import org.activiti.cloud.starter.query.configuration.EnableActivitiQuery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableActivitiQuery
public class ActivitiQueryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivitiQueryApplication.class, args);
    }

}
