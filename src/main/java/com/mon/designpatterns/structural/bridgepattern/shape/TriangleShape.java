package com.mon.designpatterns.structural.bridgepattern.shape;

import com.mon.designpatterns.structural.bridgepattern.color.IColor;

public class TriangleShape extends AbstractShape{
    public TriangleShape(IColor color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println(">>> Drawing a Triangle and >>>");
        color.paint();
    }
}
