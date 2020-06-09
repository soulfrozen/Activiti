package com.hacker.activiti.rb.event;

import org.springframework.context.ApplicationEvent;

public class HackerEvent extends ApplicationEvent {

    public HackerEvent(Object source) {
        super(source);
    }
}
