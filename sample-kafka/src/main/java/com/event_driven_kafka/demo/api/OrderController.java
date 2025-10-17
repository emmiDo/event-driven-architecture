package com.event_driven_kafka.demo.api;

import com.event_driven_kafka.demo.event.OrderEvent;
import com.event_driven_kafka.demo.producer.OrderEventProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderEventProducer orderEventProducer;

    @PostMapping("/orders")
    public ResponseEntity<String> createOrder(@RequestBody OrderEvent orderEvent) {
        orderEventProducer.sendOrderEvent(orderEvent);
        return ResponseEntity.ok("Order created successfully");
    }
}
