package com.mon.designpatterns.creational.abstractfactorypattern.writing;

/**
 * Author: Monsuru <br/>
 * Created on 19/08/2022 8:35 PM
 */
public class Biro implements WritingMaterial {
    private final int cost;
    private final String name;

    public Biro(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    @Override
    public String getWritingMaterial() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "{Biro =" + " cost: " + cost + " name: " + name + "}";
    }
}
