package com.thoughtworks.ddd_workshop.model;

import java.util.Currency;

public class Price {
    private final int amount;
    private final Currency currency;

    public Price(int price, Currency currency) {
        this.amount = price;
        this.currency = currency;
    }
}
