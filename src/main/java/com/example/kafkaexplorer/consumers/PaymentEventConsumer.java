package com.example.kafkaexplorer.consumers;

import com.example.kafkaexplorer.eventData.PaymentEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentEventConsumer {

    @KafkaListener(topics = "payment_events", groupId = "payment_group")
    public void handlePaymentEvent(PaymentEvent paymentEvent) {
        // Process the payment event, e.g., update payment status
        System.out.println("Received Payment Event: " + paymentEvent);
        // Implement the logic for payment processing and order status update
    }
}