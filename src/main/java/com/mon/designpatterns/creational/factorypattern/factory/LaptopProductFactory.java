package com.mon.designpatterns.creational.factorypattern.factory;

import com.mon.designpatterns.creational.factorypattern.*;

/**
 * Author: Monsuru <br/>
 * Created on 19/08/2022 1:18 PM
 */
public class LaptopProductFactory implements ProductFactory {
    @Override
    public Product createProduct(String company) {
        Product product;
        switch (company){
            case "google":
                product = new GoogleProduct("Phone", "2.0", 110_000.0, 2020);
                break;
            case "apple":
                product = new AppleProduct("Phone", "5.0", 256_000.0, 2021);
                break;
            case "microsoft":
                product = new MicrosoftProduct("Phone", "4.0", 105_000.0, 2019);
                break;
            default:
                product = new GoogleProduct("Random", "1.0", 1_000.0, 2000);
        }
        return product;
    }
}
