package com.event_driven_kafka.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfiguration {

    @Bean
    public NewTopic orderTopic() {
        return new NewTopic("order_events", 1, (short) 1);
    }

    @Bean
    public NewTopic paymentTopic() {
        return new NewTopic("payment_events", 1, (short) 1);
    }

}
