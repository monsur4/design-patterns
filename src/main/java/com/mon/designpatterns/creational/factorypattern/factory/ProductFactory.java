package com.mon.designpatterns.creational.factorypattern.factory;

import com.mon.designpatterns.creational.factorypattern.Product;

/**
 * Author: Monsuru <br/>
 * Created on 19/08/2022 12:31 PM
 */
public interface ProductFactory {
    Product createProduct(String company);
}
