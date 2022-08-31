package com.mon.designpatterns.structural.bridgepattern.shape;

import com.mon.designpatterns.structural.bridgepattern.color.IColor;

public class CircleShape extends AbstractShape{

    public CircleShape(IColor color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println(">>> Drawing a Circle and >>>");
        color.paint();
    }
}
