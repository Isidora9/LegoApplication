package org.example;

import model.Circle;
import model.Rectangle;
import model.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LegoApplicationTest {
    // todo: add test for calculations of circle area and triangle area and for all perimeter calculations

    @Test
    public void rectangleAreaCalculationTest() {
        Rectangle rectangle = new Rectangle(2, 3);
        double area = rectangle.calculateArea();
        assertEquals(6, area);
    }
    @Test
    public void rectanglePerimeterCalculationTest(){
        Rectangle rectangle = new Rectangle(2, 3);
        double perimeter = rectangle.calculatePerimeter();
        assertEquals(10, perimeter);
    }
    @Test
    public void triangleAreaCalculationTest(){
        Triangle triangle = new Triangle(3, 4);
        double area = triangle.calculateArea();
        assertEquals((double)3 * 4 / 2, area);
    }
    @Test
    public void trianglePerimeterCalculationTest(){
        Triangle triangle = new Triangle(3, 4);
        double perimeter = triangle.calculatePerimeter();
        assertEquals(12, perimeter);
    }
    @Test
    public void circleAreaCalculationTest(){
        Circle circle = new Circle(5);
        double area = circle.calculateArea();
        assertEquals((double) 5 * 5 * Math.PI, area);
    }
    @Test
    public void circlePerimeterCalculation(){
        Circle circle = new Circle(5);
        double perimeter = circle.calculatePerimeter();
        assertEquals((double) 2 * 5 * Math.PI, perimeter);
    }
}