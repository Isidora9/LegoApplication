package model;

public class Rectangle extends TwoDimShape {
    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * a + 2 * b;
    }
}
