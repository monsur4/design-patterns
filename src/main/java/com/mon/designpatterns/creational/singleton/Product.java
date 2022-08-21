package com.mon.designpatterns.creational.singleton;

/**
 * Author: Monsuru <br/>
 * Created on 20/08/2022 7:13 PM
 */
public class Product {
    private static Product instance;

    private Product(){}

    public static Product getInstance(){
        if(instance == null){
            instance = new Product();
        }
        return instance;
    }
}
