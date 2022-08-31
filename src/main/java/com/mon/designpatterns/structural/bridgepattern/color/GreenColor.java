package com.mon.designpatterns.structural.bridgepattern.color;

public class GreenColor implements IColor{
    @Override
    public void paint() {
        System.out.println(">>> Painting with Green Color");
    }
}
