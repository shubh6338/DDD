package com.thoughtworks.ddd_workshop.domain.model;

import java.util.Objects;

import static com.thoughtworks.ddd_workshop.domain.domain_service.PricingService.getUpdatedPrice;

public class Product {
    private final String name;
    private final Price price;
    private final int weight;


    public Product(String name, Price price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public Product(String name, int weight) {
        this.name = name;
        this.price = getUpdatedPrice(name);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
