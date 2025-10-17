package com.event_driven_kafka.demo.api;

import com.event_driven_kafka.demo.event.PaymentEvent;
import com.event_driven_kafka.demo.producer.PaymentEventProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private PaymentEventProducer paymentEventProducer;

    @PostMapping("/payments")
    public ResponseEntity<String> processPayment(@RequestBody PaymentEvent paymentEvent) {
        paymentEventProducer.sendPaymentEvent(paymentEvent);
        return ResponseEntity.ok("Payment processed successfully");
    }

}
