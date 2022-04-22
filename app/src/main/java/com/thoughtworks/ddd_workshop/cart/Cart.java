package com.thoughtworks.ddd_workshop.cart;

import com.thoughtworks.ddd_workshop.model.Item;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    final private List<Item> items;

    public Cart(List<Item> items) {
        this.items = items;
    }

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItemToCart(Item item) {
        items.add(item);
    }

    private boolean contains(Item item) {
        return items.contains(item);
    }

    public void printItems() {
        items.forEach(item -> System.out.println(item.toString()));
    }
}
