package com.amazon.design.enums;

public enum ShipmentStatus {
    PENDING(1),
    SHIPPED(2),
    DELIVERED(3),
    ON_HOLD(4);

    private final int value;

    ShipmentStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
