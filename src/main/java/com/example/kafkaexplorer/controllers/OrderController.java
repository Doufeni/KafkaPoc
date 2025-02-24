package com.example.kafkaexplorer.controllers;

import com.example.kafkaexplorer.eventData.OrderEvent;
import com.example.kafkaexplorer.producers.OrderEventProducer;
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
        // Process the received order event and send it to Kafka
        orderEventProducer.sendOrderEvent(orderEvent);
        return ResponseEntity.ok("Order created successfully");
    }
}
