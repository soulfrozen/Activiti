package com.hacker.activiti.connector.channels;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface TestChannel {


    @Input("test")
    SubscribableChannel input();
}
