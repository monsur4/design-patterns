package com.mon.designpatterns.creational.factorypattern.factory;

import com.mon.designpatterns.creational.factorypattern.*;

/**
 * Author: Monsuru <br/>
 * Created on 19/08/2022 1:18 PM
 */
public class ExpensiveLaptopProductFactory implements ProductFactory {
    @Override
    public Product createProduct(String company) {
        Product product;
        switch (company){
            case "google":
                product = new GoogleProduct("Phone", "2.0", 220_000.0, 2020);
                break;
            case "apple":
                product = new AppleProduct("Phone", "5.0", 506_000.0, 2021);
                break;
            case "microsoft":
                product = new MicrosoftProduct("Phone", "4.0", 335_000.0, 2019);
                break;
            default:
                product = new GoogleProduct("Random", "1.0", 5_000.0, 2000);
        }
        return product;
    }
}
