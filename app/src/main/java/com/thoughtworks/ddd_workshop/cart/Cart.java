package com.thoughtworks.ddd_workshop.cart;

import com.thoughtworks.ddd_workshop.model.Item;
import com.thoughtworks.ddd_workshop.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    final private List<Item> items;
    final private List<Item> removedItems;

    public Cart(List<Item> items) {
        this.items = items;
        removedItems = new ArrayList<>();
    }

    public Cart() {
        this.items = new ArrayList<>();
        this.removedItems = new ArrayList<>();
    }

    public void addItemToCart(Item item) {
        items.add(item);
    }

    private boolean contains(Item item) {
        return items.contains(item);
    }

    public void removeItem(Product product) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getProduct().equals(product)) {
                removedItems.add(items.get(i));
                items.remove(i);
                break;
            }
        }
    }

    public void printItems() {
        items.forEach(item -> System.out.println(item.toString()));
    }

    public void printRemovedItems() {
        removedItems.forEach(item -> System.out.println(item.toString()));
    }
}
