package com.thoughtworks.ddd_workshop.domain.domain_service;

import com.thoughtworks.ddd_workshop.domain.model.Cart;
import com.thoughtworks.ddd_workshop.domain.model.Order;

public class OrderItems {

    public static Order OrderService(Cart cart){
        cart.setCheckedOut(true);
        return new Order(cart.getItems());
    }
}
