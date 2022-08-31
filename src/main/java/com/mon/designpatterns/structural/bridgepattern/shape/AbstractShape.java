package com.mon.designpatterns.structural.bridgepattern.shape;

import com.mon.designpatterns.structural.bridgepattern.color.IColor;

public abstract class AbstractShape {
    IColor color;

    public AbstractShape(IColor color) {
        this.color = color;
    }

    public abstract void draw();
}
