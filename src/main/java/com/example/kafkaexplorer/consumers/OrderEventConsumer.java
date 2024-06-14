package com.example.kafkaexplorer.consumers;

import com.example.kafkaexplorer.eventData.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderEventConsumer {

    @KafkaListener(topics = "order_events", groupId = "order_group")
    public void handleOrderEvent(OrderEvent orderEvent) {
        // Process the order event, e.g., store it in the database
        System.out.println("Received Order Event: " + orderEvent);
        // Implement the logic for order processing and updating inventory
    }
}