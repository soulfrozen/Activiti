package com.hacker.activiti.rb.listener;

import com.hacker.activiti.rb.event.ApplicationPublisher;
import com.hacker.activiti.rb.event.HackerEvent;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;

public class HackerExecutionListener implements ExecutionListener {
    @Override
    public void notify(DelegateExecution delegateExecution) {

        ApplicationPublisher.publisher(new HackerEvent(delegateExecution.getEventName()));
        System.out.println("");

    }
}
