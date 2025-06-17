package com.mini.crm.config;

import com.mini.crm.event.consumer.EventConsumer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.dsl.IntegrationFlow;

@Configuration
public class IntegrationConfig {

    @Bean
    public QueueChannel eventInputChannel() {
        return new QueueChannel(100);
    }

    @Bean
    public IntegrationFlow eventConsumerFlow(EventConsumer consumer) {
        return IntegrationFlow
                .from(eventInputChannel())
                .handleReactive(consumer, "consume")
                .get();
    }
}
