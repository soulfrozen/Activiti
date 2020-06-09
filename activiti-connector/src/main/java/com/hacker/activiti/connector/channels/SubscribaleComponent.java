package com.hacker.activiti.connector.channels;

import cn.hutool.json.JSONUtil;
import com.alibaba.nacos.client.utils.JSONUtils;
import lombok.extern.slf4j.Slf4j;
import org.activiti.cloud.api.process.model.IntegrationRequest;
import org.activiti.cloud.api.process.model.IntegrationResult;
import org.activiti.cloud.connectors.starter.channels.IntegrationResultSender;
import org.activiti.cloud.connectors.starter.configuration.ConnectorProperties;
import org.activiti.cloud.connectors.starter.model.IntegrationResultBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
@EnableBinding(TestChannel.class)
public class SubscribaleComponent {

    private final IntegrationResultSender integrationResultSender;

    @Autowired
    private ConnectorProperties connectorProperties;

    public SubscribaleComponent(IntegrationResultSender integrationResultSender) {
        this.integrationResultSender = integrationResultSender;
    }

    @StreamListener("test")
    public void on(IntegrationRequest event) {

        log.info("event: {}", JSONUtil.toJsonStr(event));

//        String tweet = String.valueOf(event.getIntegrationContext().getInBoundVariables().get("text"));



        // based on http://rahular.com/twitter-sentiment-analysis/



        Map<String, Object> results = new HashMap<>();
        results.put("attitude",
                "aaa");
        results.put("matched",
                "true");


        System.out.println("");
        Message<IntegrationResult> message = IntegrationResultBuilder.resultFor(event, connectorProperties)
                .withOutboundVariables(results)
                .buildMessage();

        integrationResultSender.send(message);
    }
}
