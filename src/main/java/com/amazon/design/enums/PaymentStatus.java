package com.amazon.design.enums;

public enum PaymentStatus {
    UNPAID(1),
    PENDING(2),
    COMPLETED(3),
    FILLED(4),
    DECLINED(5),
    CANCELLED(6),
    ABANDONED(7),
    SETTLING(8),
    SETTLED(9),
    REFUNDED(10);

    private final int value;

    PaymentStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
