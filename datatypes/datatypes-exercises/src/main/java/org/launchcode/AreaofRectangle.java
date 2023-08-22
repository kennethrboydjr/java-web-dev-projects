package org.launchcode;

import java.util.Scanner;
public class AreaofRectangle {
    public static void main (String args[]){
        int length, width, area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        length = input.nextInt();
        System.out.println("Enter the width of the rectangle:");
        width = input.nextInt();
        area = length * width;
        System.out.println("The area of the rectangle is " + area + " feet squared.");
    }
}
