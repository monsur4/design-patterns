package com.mon.designpatterns.structural.bridgepattern.shape;

import com.mon.designpatterns.structural.bridgepattern.color.IColor;

public class RectangleShape extends AbstractShape{
    public RectangleShape(IColor color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println(">>> Drawing a Rectangle and >>>");
        color.paint();
    }
}
