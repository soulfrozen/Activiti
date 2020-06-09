package com.hacker.activiti.rb;

import org.activiti.cloud.starter.rb.configuration.ActivitiRuntimeBundle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration;
import org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication //(exclude = {TaskExecutionAutoConfiguration.class, TaskSchedulingAutoConfiguration.class})
//@ActivitiRuntimeBundle
@EnableDiscoveryClient
public class ActivitiRbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivitiRbApplication.class, args);
    }

}
