package com.thoughtworks.ddd_workshop.domain.model;

import java.util.Currency;

public class Price {
    private final double amount;
    private final Currency currency;

    public Price(double price, Currency currency) {
        this.amount = price;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
}
