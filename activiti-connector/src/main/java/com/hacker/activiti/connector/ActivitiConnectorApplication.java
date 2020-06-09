package com.hacker.activiti.connector;

import org.activiti.cloud.connectors.starter.configuration.EnableActivitiCloudConnector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableActivitiCloudConnector
public class ActivitiConnectorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivitiConnectorApplication.class, args);
    }

}
