package com.example.kafkaexplorer.controllers;

import com.example.kafkaexplorer.eventData.PaymentEvent;
import com.example.kafkaexplorer.producers.PaymentEventProducer;
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
        // Process the received payment event and send it to Kafka
        paymentEventProducer.sendPaymentEvent(paymentEvent);
        return ResponseEntity.ok("Payment processed successfully");
    }
}