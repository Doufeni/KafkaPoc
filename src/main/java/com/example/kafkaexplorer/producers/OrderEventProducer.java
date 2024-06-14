package com.example.kafkaexplorer.producers;

import com.example.kafkaexplorer.eventData.OrderEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderEventProducer {

    private static final String TOPIC = "order_events";

    @Autowired
    private KafkaTemplate<String, OrderEvent> kafkaTemplate;

    public void sendOrderEvent(OrderEvent orderEvent) {
        kafkaTemplate.send(TOPIC, orderEvent);
    }
}
