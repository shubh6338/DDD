/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.thoughtworks.ddd_workshop;

import com.thoughtworks.ddd_workshop.cart.Cart;
import com.thoughtworks.ddd_workshop.model.Item;

public class DDD {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Item iPadPro = new Item("IPadPro");
        Item heroPen = new Item("Hero Ink Pen");
        Item gmBat = new Item("GM Cricket Bat", 2);
        cart.addItemToCart(iPadPro);
        cart.addItemToCart(heroPen);
        cart.addItemToCart(gmBat);
        System.out.println("Items in cart are: ");
        cart.printItems();
    }
}
