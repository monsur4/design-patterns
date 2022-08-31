package com.mon.designpatterns.structural.bridgepattern.color;

public class RedColor implements IColor{
    @Override
    public void paint() {
        System.out.println(">>> Painting with Red Color");
    }
}
