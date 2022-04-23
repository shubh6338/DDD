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

    public Double calculateCost(){
        double sum = 0.0;
        for (Item item: orderedItems) {
            sum = sum + (item.getProduct().getPrice().getAmount() + item.getProduct().getWeight() * 0.01) * item.getQty();
        }
        return sum;
    }
}
