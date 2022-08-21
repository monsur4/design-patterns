package com.mon.designpatterns.creational.factorypattern.factory;

import com.mon.designpatterns.creational.factorypattern.*;

/**
 * Author: Monsuru <br/>
 * Created on 19/08/2022 1:10 PM
 */
public class TabProductFactory implements ProductFactory {
    @Override
    public Product createProduct(String company) {
        Product product;
        switch (company){
            case "google":
                product = new GoogleProduct("Tab", "2.0", 20_000.0, 2020);
                break;
            case "apple":
                product = new AppleProduct("Tab", "5.0", 30_000.0, 2021);
                break;
            case "microsoft":
                product = new MicrosoftProduct("Tab", "4.0", 40_000.0, 2019);
                break;
            default:
                product = new GoogleProduct("Random", "1.0", 1_000.0, 2000);
        }
        return product;
    }
}
