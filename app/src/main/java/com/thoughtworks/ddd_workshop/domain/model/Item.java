package com.thoughtworks.ddd_workshop.domain.model;

public class Item {
    private final Product product;
    private final int qty;

    public Item(Product product) {
        this.product = product;
        this.qty = 1;
    }

    public Item(Product product, int qty1) {
        this.product = product;
        this.qty = qty1;
    }

    @Override
    public String toString() {
        return "Item { name = " + product.getName() + ", price = " + product.getPrice().getAmount() + " "
                + product.getPrice().getCurrency() + ", qty = " + qty + " } ";
    }

    public Product getProduct() {
        return product;
    }
}
