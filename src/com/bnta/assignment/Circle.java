package com.bnta.assignment;


import java.util.ArrayList;

public class Circle {
    public static ArrayList<Circle> circle = new ArrayList<>();
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference(){
        return 2 * radius * Math.PI;



    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
