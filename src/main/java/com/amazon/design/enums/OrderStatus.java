package com.amazon.design.enums;

public enum OrderStatus {
    UNSHIPPED(1),
    PENDING(2),
    SHIPPED(3),
    COMPLETED(4),
    CANCELED(5),
    REFUND_APPLIED(6);

    private final int value;

    OrderStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
