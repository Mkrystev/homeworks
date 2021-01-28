package com.academy.homeworks;

import java.util.Scanner;

public class Rectangle {
   public static void rectanglePerimeter() {
        double height;
        double width;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter values for the sides of the rectangle (width and height).");
        height = scanner.nextDouble();
        width = scanner.nextDouble();

        System.out.println("S = " + height*width + "cm2" + " P = " + ((height*2) + (width*2)) + "cm");

    }
}
