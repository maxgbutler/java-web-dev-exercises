package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;
public class Area {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double radius;
        double area;

        System.out.print("Enter a radius: ");
        //radius = input.nextDouble();

        while(!input.hasNextDouble()) {
            throw new Error("Please enter a positive number!");
            //input.next();
        }

//        if (radius >= 0) {
//            area = Circle.getArea(radius);
//            System.out.println(area);
//        } else {
//            throw new Error("Please enter a positive number!");
//        }
    }
}
