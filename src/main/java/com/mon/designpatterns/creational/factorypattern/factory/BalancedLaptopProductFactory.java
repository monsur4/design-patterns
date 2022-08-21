package com.mon.designpatterns.creational.factorypattern.factory;

import com.mon.designpatterns.creational.factorypattern.AppleProduct;
import com.mon.designpatterns.creational.factorypattern.GoogleProduct;
import com.mon.designpatterns.creational.factorypattern.MicrosoftProduct;
import com.mon.designpatterns.creational.factorypattern.Product;

/**
 * Author: Monsuru <br/>
 * Created on 19/08/2022 1:18 PM
 */
public class BalancedLaptopProductFactory implements ProductFactory {
    private int position = 0;
    @Override
    public Product createProduct(String company) {
        Product product;
        switch (position%3){
            case 0:
                product = new GoogleProduct("Phone", "2.0", 110_000.0, 2020);
                break;
            case 1:
                product = new AppleProduct("Phone", "5.0", 256_000.0, 2021);
                break;
            case 2:
                product = new MicrosoftProduct("Phone", "4.0", 105_000.0, 2019);
                break;
            default:
                product = new GoogleProduct("Random", "1.0", 1_000.0, 2000);
        }
        position++;
        return product;
    }
}
