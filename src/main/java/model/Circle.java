package model;

public class Circle implements Shape {
    private int r;
    public Circle(int r){
        this.r = r;
    }
    @Override
    public double calculateArea() {

        return Math.pow(r, 2) * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * r * Math.PI;
    }
}
