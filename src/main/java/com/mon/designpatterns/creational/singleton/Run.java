package com.mon.designpatterns.creational.singleton;

/**
 * Author: Monsuru <br/>
 * Created on 20/08/2022 7:17 PM
 */
public class Run {
    public static void main(String[] args) {
        Product product1 = Product.getInstance();
        Product product2 = Product.getInstance();

        System.out.println("product1 = " + product1);
        System.out.println("product2 = " + product2);
    }
}
