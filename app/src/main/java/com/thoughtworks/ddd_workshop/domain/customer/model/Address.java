package com.thoughtworks.ddd_workshop.domain.customer.model;

public class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
