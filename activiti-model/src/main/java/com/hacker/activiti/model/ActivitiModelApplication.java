package com.hacker.activiti.model;

import org.activiti.cloud.organization.EnableActivitiOrganization;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.hacker.activiti.model", "org.activiti.cloud.organization", "org.activiti.cloud.services.organization"})
@EnableActivitiOrganization
public class ActivitiModelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivitiModelApplication.class, args);
    }

}
