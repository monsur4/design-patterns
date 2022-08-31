package com.mon.designpatterns.structural.bridgepattern.color;

public class YellowColor implements IColor{
    @Override
    public void paint() {
        System.out.println(">>> Painting with Yellow Color");
    }
}
