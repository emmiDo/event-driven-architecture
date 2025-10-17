package com.event_driven_kafka.demo.consumer;

import com.event_driven_kafka.demo.event.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderEventConsumer {

    @KafkaListener(topics = "order_events", groupId = "order_group")
    public void handleOrderEvent(OrderEvent orderEvent) {
        System.out.println("Received Order Event: " + orderEvent);
    }
}
