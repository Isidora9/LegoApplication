package model;

public class Triangle extends TwoDimShape {
    public Triangle(int a, int b) {
        super(a, b);
    }

    @Override
    public double calculateArea() {
        return (double)a * b / 2;
    }

    @Override
    public double calculatePerimeter() {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return a + b + c;
    }
}
