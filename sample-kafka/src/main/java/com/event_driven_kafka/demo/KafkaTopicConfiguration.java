package com.event_driven_kafka.demo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfiguration {

    @Bean
    public NewTopic exampleTopic() {
        return new NewTopic("example_topic", 1, (short) 1);
    }

}
