package com.hacker.activiti.audit;

import org.activiti.cloud.starter.audit.configuration.EnableActivitiAudit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableActivitiAudit
public class ActivitiAuditApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivitiAuditApplication.class, args);
    }

}
