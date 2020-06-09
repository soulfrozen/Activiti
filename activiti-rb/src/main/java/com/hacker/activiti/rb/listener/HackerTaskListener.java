package com.hacker.activiti.rb.listener;


import com.hacker.activiti.rb.event.ApplicationPublisher;
import com.hacker.activiti.rb.event.HackerEvent;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;


public class HackerTaskListener implements TaskListener {


    @Override
    public void notify(DelegateTask delegateTask) {

        ApplicationPublisher.publisher(new HackerEvent(delegateTask.getEventName()));

        System.out.println("");

    }

}
