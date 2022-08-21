package com.mon.designpatterns.creational.abstractfactorypattern.reading;

/**
 * Author: Monsuru <br/>
 * Created on 19/08/2022 8:51 PM
 */
public class AdvancedChemistry implements ReadingMaterial{
    private final int pages;
    private final int cost;
    private final String name;

    public AdvancedChemistry(int pages, int cost, String name) {
        this.pages = pages;
        this.cost = cost;
        this.name = name;
    }

    @Override
    public ReadingMaterial getReadingMaterial() {
        return this;
    }

    @Override
    public String toString() {
        return "{AdvancedChemistry =" + " pages: " + pages + " cost: " + cost + " name: " + name + "}";
    }
}
