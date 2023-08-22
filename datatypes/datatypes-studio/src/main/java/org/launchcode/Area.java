package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a radius.");
        double radius = input.nextDouble();
        double pi = 3.14;
        double area;
        area = Circle.getArea(radius);
        input.close();
        System.out.println("The area of the circle with a radius of " + radius + " is " + area + "." );

    }
}
