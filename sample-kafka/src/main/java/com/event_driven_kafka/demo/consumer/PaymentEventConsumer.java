package com.event_driven_kafka.demo.consumer;

import com.event_driven_kafka.demo.event.PaymentEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentEventConsumer {

    @KafkaListener(topics = "payment_events", groupId = "payment_group")
    public void handlePaymentEvent(PaymentEvent paymentEvent) {
        System.out.println("Received Payment Event: " + paymentEvent);
    }

}
