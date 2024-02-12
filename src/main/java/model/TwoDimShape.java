package model;

abstract class TwoDimShape implements Shape {
    public int a;
    public int b;
    public TwoDimShape(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
