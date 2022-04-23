/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.thoughtworks.ddd_workshop;

import com.thoughtworks.ddd_workshop.domain.customer.model.Account;
import com.thoughtworks.ddd_workshop.domain.customer.model.Address;
import com.thoughtworks.ddd_workshop.domain.customer.model.Customer;
import com.thoughtworks.ddd_workshop.domain.model.*;

import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;

import static com.thoughtworks.ddd_workshop.domain.customer.service.CustomerService.updateAddress;
import static com.thoughtworks.ddd_workshop.domain.domain_service.OrderItems.OrderService;

public class DDD {
    public static HashMap<String, Price> competitorMap = new HashMap<>();

    public static void main(String[] args) {
        Currency usd = Currency.getInstance("USD");
        Product product1 = new Product("IPadPro", new Price(10, usd));
        Product product2 = new Product("Hero Ink Pen", new Price(20, usd));
        Product product3 = new Product("GM Cricket Bat", new Price(30, usd));
        Product product4 = new Product("IPadPro", new Price(40, usd));
        Cart cart1 = new Cart();

        Item iPadPro = new Item(product1);
        Item heroPen = new Item(product2);
        Item gmBat = new Item(product3, 2);
        cart1.addItemToCart(iPadPro);
        cart1.addItemToCart(heroPen);
        cart1.addItemToCart(gmBat);
        System.out.println("Original Items : ");
        cart1.printItems();
        cart1.removeItem(product1);
        System.out.println("\nCurrent Items after removal of iPad: ");
        cart1.printItems();
        System.out.println("\nRemoved Items: ");
        cart1.printRemovedItems();

        competitorMap.put("IPadPro", new Price(100, usd));
        Product product5 = new Product("IPadPro");
        Cart cart4 = new Cart();
        cart4.addItemToCart(new Item(product5));
        cart4.printItems();

        Order order = OrderService(cart4);
        System.out.println("Ordered items:");
        order.printItems();
        System.out.println("Cart details: ");
        cart4.printItems();
        Account account = new Account("Shubham", "12345676", new Address("Delhi"));
        List<Account> accountList = new ArrayList<>();

        Customer customer = new Customer("Shubham", new Address("Delhi"));
        accountList.add(account);
        customer.setAccountList(accountList);

        Address updatedAddress = new Address("Gurgaon");
        updateAddress(customer, updatedAddress);
        System.out.println(customer.getAddress().getCity());
        System.out.println(account.getAddress().getCity());
    }
}
