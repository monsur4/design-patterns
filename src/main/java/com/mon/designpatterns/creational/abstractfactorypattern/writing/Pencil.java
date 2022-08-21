package com.mon.designpatterns.creational.abstractfactorypattern.writing;

/**
 * Author: Monsuru <br/>
 * Created on 19/08/2022 8:29 PM
 */
public class Pencil implements WritingMaterial {
    private final int cost;
    private final String name;

    public Pencil(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    @Override
    public String getWritingMaterial() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "{Pencil =" + " cost: " + cost + " name: " + name + "}";
    }
}
