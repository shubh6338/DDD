package com.thoughtworks.ddd_workshop.domain.customer.service;

import com.thoughtworks.ddd_workshop.domain.customer.model.Account;
import com.thoughtworks.ddd_workshop.domain.customer.model.Address;
import com.thoughtworks.ddd_workshop.domain.customer.model.Customer;

import java.util.List;

public class CustomerService {

    public static void updateAddress(Customer customer, Address address){
        customer.updateAddress(address);
        customer.getAccountList()
                .forEach(account -> account.updateAddress(address));
    }
}
