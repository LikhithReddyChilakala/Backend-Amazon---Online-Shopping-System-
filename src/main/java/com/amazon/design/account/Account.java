package com.amazon.design.account;

import com.amazon.design.enums.AccountStatus;

public abstract class Account {
    private String username;
    private String password;
    private String name;
    private String email;
    private String phone;
    private String shippingAddress;
    private AccountStatus status;

    public Account(String username, String password, String name, String email, 
                   String phone, String shippingAddress, AccountStatus status) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.shippingAddress = shippingAddress;
        this.status = status != null ? status : AccountStatus.ACTIVE;
    }

    // Getters
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getShippingAddress() { return shippingAddress; }
    public AccountStatus getStatus() { return status; }

    // Setters
    public void setPassword(String password) { this.password = password; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setShippingAddress(String shippingAddress) { this.shippingAddress = shippingAddress; }
    public void setStatus(AccountStatus status) { this.status = status; }

    public abstract void addProduct(Object product);
    public abstract void addProductReview(Object review);
    public void resetPassword() {
        // Logic for resetting password
    }
}
