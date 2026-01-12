package com.amazon.design.account;

public class Guest extends Customer {
    private Object shoppingCart;

    public Guest() {
        super("guest", "", "Guest User", "", "", "");
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

    public void registerAccount() {
        // Logic to register as a member
    }
}
