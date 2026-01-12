package com.amazon.design.order;

import com.amazon.design.enums.OrderStatus;
import java.util.Date;

public class Order {
    private int orderNumber;
    private OrderStatus status;
    private Date orderDate;
    private Object orderLog;

    public Order(int orderNumber, OrderStatus status) {
        this.orderNumber = orderNumber;
        this.status = status != null ? status : OrderStatus.PENDING;
        this.orderDate = new Date();
    }

    public int getOrderNumber() { return orderNumber; }
    public OrderStatus getStatus() { return status; }
    public Date getOrderDate() { return orderDate; }

    public void sendForShipment() {
        // Logic to send order for shipment
    }

    public void makePayment(Object payment) {
        // Logic to process payment
    }

    public void addOrderLog(Object log) {
        this.orderLog = log;
    }
}
