package com.amazon.design.account;

import java.util.ArrayList;
import java.util.List;

public class Member extends Customer {
    private Object account;
    private Object shoppingCart;

    public Member(String username, String password, String name, String email,
                  String phone, String shippingAddress) {
        super(username, password, name, email, phone, shippingAddress);
        this.shoppingCart = new Object();
    }

    @Override
    public Object getShoppingCart() {
        return shoppingCart;
    }

    @Override
    public void addItemToCart(Object item) {
        // Logic to add item to shopping cart
    }

    @Override
    public void removeItemFromCart(Object item) {
        // Logic to remove item from shopping cart
    }

    public void placeOrder(Object order) {
        // Logic to place order
    }
}
