package com.mon.designpatterns.creational.factorypattern;

import com.mon.designpatterns.creational.factorypattern.factory.*;

/**
 * Author: Monsuru <br/>
 * Created on 19/08/2022 2:57 PM
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ProductFactory productFactory = new TabProductFactory();

        // google product
        Product googleTab = productFactory.createProduct("google");
        System.out.println("googleTab = " + googleTab);
        System.out.println("googleTab product current price= " + googleTab.currentPrice());

        productFactory = new LaptopProductFactory();
        Product googleLaptop = productFactory.createProduct("google");
        System.out.println("googleLaptop = " + googleLaptop);
        System.out.println("googleLaptop product current price= " + googleLaptop.currentPrice());

        System.out.println("\n\n");
        // apple product
        productFactory = new TabProductFactory();
        Product appleTab = productFactory.createProduct("apple");
        System.out.println("appleTab = " + appleTab);
        System.out.println("appleTab product current price= " + appleTab.currentPrice());

        productFactory = new LaptopProductFactory();
        Product appleLaptop = productFactory.createProduct("apple");
        System.out.println("appleLaptop = " + appleLaptop);
        System.out.println("appleLaptop product current price= " + appleLaptop.currentPrice());

        System.out.println("\n\n");
        // random laptop product
        int i = 0;
        while (i < 5) {
            productFactory = new RandomLaptopProductFactory();
            Product randomLaptop = productFactory.createProduct("-");
            System.out.println("randomLaptop = " + randomLaptop);
            System.out.println("randomLaptop product current price= " + randomLaptop.currentPrice());
            i++;
        }

        System.out.println("\n\n");
        // balanced laptop product
        int j = 0;
        productFactory = new BalancedLaptopProductFactory();
        while (j < 5) {
            Product balancedLaptop = productFactory.createProduct("-");
            System.out.println("balancedLaptop = " + balancedLaptop);
            System.out.println("balancedLaptop product current price= " + balancedLaptop.currentPrice());
            j++;
        }

    }
}
