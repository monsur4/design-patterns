package com.mon.designpatterns.structural.bridgepattern;

import com.mon.designpatterns.structural.bridgepattern.color.GreenColor;
import com.mon.designpatterns.structural.bridgepattern.color.IColor;
import com.mon.designpatterns.structural.bridgepattern.color.RedColor;
import com.mon.designpatterns.structural.bridgepattern.color.YellowColor;
import com.mon.designpatterns.structural.bridgepattern.shape.CircleShape;
import com.mon.designpatterns.structural.bridgepattern.shape.RectangleShape;

public class App {
    public static void main(String[] args) {
        IColor redColor = new RedColor();
        IColor yellowColor = new YellowColor();
        RectangleShape rectangleShape = new RectangleShape(redColor);
        rectangleShape.draw();
        rectangleShape = new RectangleShape(yellowColor);
        rectangleShape.draw();

        IColor greenColor = new GreenColor();
        CircleShape circleShape = new CircleShape(greenColor);
        circleShape.draw();
    }
}
