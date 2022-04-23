package com.thoughtworks.ddd_workshop.domain.customer.model;

public class Account {
    final private String customerName;
    final private String accountNum;
    private Address address;

    public Account(String customerName, String accountNum, Address address) {
        this.customerName = customerName;
        this.accountNum = accountNum;
        this.address = address;
    }

    public void updateAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
