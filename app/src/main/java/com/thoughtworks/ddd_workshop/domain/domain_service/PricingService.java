package com.thoughtworks.ddd_workshop.domain.domain_service;

import com.thoughtworks.ddd_workshop.domain.model.Price;

import static com.thoughtworks.ddd_workshop.DDD.competitorMap;

public class PricingService {

    public static Price getUpdatedPrice(String name){
        Price competitorPrice = competitorMap.get(name);
        return new Price(competitorPrice.getAmount() * 0.9, competitorPrice.getCurrency());
    }
}
