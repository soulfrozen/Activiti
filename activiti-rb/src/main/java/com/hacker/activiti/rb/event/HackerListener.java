package com.hacker.activiti.rb.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
@Slf4j
public class HackerListener {

    @TransactionalEventListener
    public void onApplicationEvent(HackerEvent hackerEvent) {
        log.info("{}", hackerEvent.getSource());
    }
}
