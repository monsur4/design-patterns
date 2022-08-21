package com.mon.designpatterns.creational.factorypattern.factory;

import com.mon.designpatterns.creational.factorypattern.*;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Author: Monsuru <br/>
 * Created on 19/08/2022 1:18 PM
 */
public class RandomLaptopProductFactory implements ProductFactory {
    @Override
    public Product createProduct(String company) {
        Random random = new SecureRandom();
        int value = random.nextInt(3);
        Product product;
        switch (value){
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
        return product;
    }
}
