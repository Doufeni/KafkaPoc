package com.example.kafkaexplorer.eventData;

import java.math.BigDecimal;
import java.util.Objects;

public class PaymentEvent {
    private Long orderId;
    private BigDecimal amount;

    public PaymentEvent(Long orderId, BigDecimal amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentEvent{" +
                "orderId=" + orderId +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentEvent that = (PaymentEvent) o;
        return Objects.equals(orderId, that.orderId) && Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, amount);
    }
}
