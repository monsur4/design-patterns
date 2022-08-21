package com.mon.designpatterns.creational.factorypattern;

import java.time.LocalDateTime;

/**
 * Author: Monsuru <br/>
 * Created on 19/08/2022 12:33 PM
 */
public class AppleProduct implements Product {
    private static final Double INFLATION = 5.0;
    private final String name;
    private final String version;
    private final Double productionPrice;
    private final LocalDateTime dateTime;
    private final int yearOfProduction;

    public AppleProduct(String name, String version, Double productionPrice, int yearOfProduction) {
        this.name = name;
        this.version = version;
        this.productionPrice = productionPrice;
        this.dateTime = LocalDateTime.now();
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void printProduct() {
        System.out.println(this);
    }

    @Override
    public Double currentPrice() {
        return productionPrice + ((dateTime.getYear() - yearOfProduction) * INFLATION);
    }

    @Override
    public String toString() {
        return "{Product "+
                "name: " + name +
                " version: " + version +
                " productionPrice: " + productionPrice +
                " yearOfProduction: " + yearOfProduction +
                " dateTime: " + dateTime +
                "}";
    }
}
