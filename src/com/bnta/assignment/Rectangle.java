package com.bnta.assignment;

import java.util.ArrayList;

public class Rectangle {
    public static ArrayList<Rectangle> rectangle = new ArrayList<>();
    private float length;
    private float width;


    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2));
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
