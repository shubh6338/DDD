package com.thoughtworks.ddd_workshop.model;

public class Item {
    private final String name;
    private final int qty;

    public Item(String name) {
        this.name = name;
        this.qty = 1;
    }

    public Item(String name, int qty1) {
        this.name = name;
        this.qty = qty1;
    }

    @Override
    public String toString() {
        return "Item { name = " + name + ", qty = " + qty + " } ";
    }
}
