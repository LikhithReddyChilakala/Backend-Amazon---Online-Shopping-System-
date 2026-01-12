package com.amazon.design.product;

public class Product {
    private String productId;
    private String name;
    private double price;
    private Object category;
    private int availableItemCount;

    public Product(String productId, String name, double price, Object category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
        this.availableItemCount = 0;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public Object getCategory() { return category; }
    public int getAvailableCount() { return availableItemCount; }

    public void setPrice(double newPrice) { this.price = newPrice; }
}
