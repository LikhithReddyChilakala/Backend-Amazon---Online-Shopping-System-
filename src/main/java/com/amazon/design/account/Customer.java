package com.amazon.design.account;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer extends Account {
    private List items;

    public Customer(String username, String password, String name, String email,
                    String phone, String shippingAddress) {
        super(username, password, name, email, phone, shippingAddress, null);
        this.items = new ArrayList();
    }

    public abstract Object getShoppingCart();

    public abstract void addItemToCart(Object item);

    public abstract void removeItemFromCart(Object item);

    @Override
    public void addProduct(Object product) {
        // Logic for adding product
    }

    @Override
    public void addProductReview(Object review) {
        // Logic for adding review
    }
}
