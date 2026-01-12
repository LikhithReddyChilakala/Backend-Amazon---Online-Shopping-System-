package com.amazon.design.enums;

public enum AccountStatus {
    ACTIVE(1),
    BLOCKED(2),
    BANNED(3),
    COMPROMISED(4),
    ARCHIVED(5),
    UNKNOWN(6);

    private final int value;

    AccountStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
