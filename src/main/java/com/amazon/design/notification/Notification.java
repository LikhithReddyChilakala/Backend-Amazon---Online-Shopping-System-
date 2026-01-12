package com.amazon.design.notification;

import java.util.Date;

public abstract class Notification {
    private String notificationId;
    private Date createdOn;
    private String content;

    public Notification(String notificationId, String content) {
        this.notificationId = notificationId;
        this.content = content;
        this.createdOn = new Date();
    }

    public String getNotificationId() { return notificationId; }
    public Date getCreatedOn() { return createdOn; }
    public String getContent() { return content; }

    public abstract void sendNotification(Object account);
}
