package com.hacker.activiti.rb.config;

import org.activiti.cloud.services.events.ProcessEngineChannels;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration;
import org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@EnableBinding(ProcessEngineChannels.class)
@Configuration
public class ActivitiRuntimeBundleConfiguration {
}
