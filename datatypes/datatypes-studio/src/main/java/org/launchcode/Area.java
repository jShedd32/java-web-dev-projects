package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a radius: *");

        if (input.hasNextDouble()) {
            Double radius = input.nextDouble();

            if (radius > 0) {

                Double Area = Circle.getArea(radius);
                System.out.println("The area of a circle with a radius of" + radius + "is" + Area);
            } else {
                System.out.println("Must enter a positive number");
            }
        } else {
            System.out.println("Must be a valid number");


            input.close();
        }
    }
    }
