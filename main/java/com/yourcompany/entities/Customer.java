package com.yourcompany.entities;

public class Customer {
    private String name;
    private boolean hasOrder;

    public Customer(String name) {
        this.name = name;
        this.hasOrder = false;
    }

    public String getName() {
        return name;
    }

    public boolean hasOrder() {
        return hasOrder;
    }

    public void setOrder(boolean hasOrder) {
        this.hasOrder = hasOrder;
    }
}

