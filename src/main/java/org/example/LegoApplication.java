package org.example;

import model.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LegoApplication {
    public static void main(String[] args) {
//        List<LegoPart> legoPartList = new ArrayList<LegoPart>(); //primer za polimorfizam
        Shape rectangle1 = new Rectangle(5, 6);
        LegoPart housePart = new LegoPart(rectangle1, "purple");
//        legoPartList.add(housePart);

        Shape rectangle2 = new Rectangle(2, 3);
        LegoPart doorPart = new LegoPart(rectangle2, "yellow");
//        legoPartList.add(doorPart);

        Shape triangle = new Triangle(3, 4);
        LegoPart roofPart = new LegoPart(triangle, "white");
//        legoPartList.add(roofPart);

        Shape circle = new Circle(3);
        LegoPart sunPart = new LegoPart(circle, "yellow");
//        legoPartList.add(sunPart);
        //todo: implement adding lego parts to the list using the new java version way
        List<LegoPart>legoPartList = List.of(housePart, doorPart, roofPart, sunPart);

        double rectangleArea1 = rectangle1.calculateArea();
        double rectangleArea1Rounded = Double.parseDouble(String.format("%.2f", rectangleArea1));
        double rectanglePerimeter1 = rectangle1.calculatePerimeter();
        double rectanglePerimeter1Rounded = Double.parseDouble(String.format("%.2f", rectanglePerimeter1));

        double rectangleArea2 = rectangle2.calculateArea();
        double rectangleArea2Rounded = Double.parseDouble(String.format("%.2f", rectangleArea2));
        double rectanglePerimeter2 = rectangle2.calculatePerimeter();
        double rectanglePerimeter2Rounded = Double.parseDouble(String.format("%.2f", rectanglePerimeter2));

        double triangleArea = triangle.calculateArea();
        double triangleAreaRounded = Double.parseDouble(String.format("%.2f", triangleArea));
        double trianglePerimeter = triangle.calculatePerimeter();
        double trianglePerimeterRounded = Double.parseDouble(String.format("%.2f", trianglePerimeter));

        double circleArea = circle.calculateArea();
        double circleAreaRounded = Double.parseDouble((String.format("%.2f", circleArea)));
        double circlePerimeter = circle.calculatePerimeter();
        double circlePerimeterRounded = Double.parseDouble(String.format("%.2f", circlePerimeter));


        double sumOfAreas = rectangleArea1Rounded + rectangleArea2Rounded + triangleAreaRounded + circleAreaRounded;

        System.out.println("Rectangle1 area: " + rectangleArea1Rounded +  "; Rectangle1 perimeter: " + rectanglePerimeter1Rounded);
        System.out.println("Rectangle2 area: " + rectangleArea2Rounded + "; Rectangle2 perimeter: " + rectanglePerimeter2Rounded);
        System.out.println("Triangle area: " + triangleAreaRounded + "; Triangle perimeter: " + trianglePerimeterRounded);
        System.out.println("Circle area: " + circleAreaRounded + "; Circle perimeter: " + circlePerimeterRounded);
        System.out.println("Sum of all areas is: " + sumOfAreas);

        System.out.println("List of colors:");

        List<String> listOfColors = new ArrayList<>();
        for (model.LegoPart legoPart : legoPartList) {
            listOfColors.add(legoPart.getColor());
            //System.out.println(legoPart.getColor());
        }
        Set<String> distinctListOfColors = new HashSet<>(listOfColors);
        for (String color : distinctListOfColors) {
            System.out.println(color);
        }

//        List<String> distinctListOfColors = legoPartList.stream().map(LegoPart::getColor).distinct().collect(Collectors.toList());
//        for(String color : distinctListOfColors) {
//            System.out.println(color);
//        }
    }
}