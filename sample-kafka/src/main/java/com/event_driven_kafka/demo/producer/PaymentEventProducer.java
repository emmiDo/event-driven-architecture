package com.event_driven_kafka.demo.producer;

import com.event_driven_kafka.demo.event.PaymentEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PaymentEventProducer {

    private final KafkaTemplate<String, PaymentEvent> kafkaTemplate;
    private final String TOPIC = "payment_events";

    @Autowired
    public PaymentEventProducer(KafkaTemplate<String, PaymentEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendPaymentEvent(PaymentEvent paymentEvent) {
        kafkaTemplate.send(TOPIC, paymentEvent);
    }

}
