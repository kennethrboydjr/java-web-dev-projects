package org.launchcode;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main (String args[]){
        int miles, gallons, mpg;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven:");
        miles = input.nextInt();
        System.out.println("Enter the number of gallons used:");
        gallons = input.nextInt();
        mpg = miles / gallons;
        System.out.println("The gas mileage for your vehicle is " + mpg + "mpg." );
    }
}
