package com.thoughtworks.ddd_workshop.domain.model;

import java.util.List;

public class Order {
    final private List<Item> orderedItems;

    public Order(List<Item> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public void printItems() {
        orderedItems.forEach(item -> System.out.println(item.toString()));
    }
}
