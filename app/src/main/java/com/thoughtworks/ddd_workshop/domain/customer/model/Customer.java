package com.thoughtworks.ddd_workshop.domain.customer.model;

import java.util.List;

import static java.util.Collections.emptyList;

public class Customer {
    final private String name;
    private Address address;
    private List<Account> accountList;

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
        this.accountList = emptyList();
    }

    public Customer(String name, Address address, List<Account> accountList) {
        this.name = name;
        this.address = address;
        this.accountList = accountList;
    }

    public void updateAddress(Address address) {
        this.address = address;
    }

    public void addAccount(Account account){
        accountList.add(account);
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public Address getAddress() {
        return address;
    }
}
