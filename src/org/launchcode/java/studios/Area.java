package org.launchcode.java.studios;

import java.util.Scanner;

/**
 * Created by cperc on 2/27/2017.
 */
public class Area {

    public static void main(String[] args){
        //A = pi * r * r for area of a circle

        Double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        Double area;
        Double radius;

        while (true) {
            System.out.println("Enter the radius of a circle");
            radius = scanner.nextDouble();

            if (radius > 0){
                area = pi * radius * radius;
                System.out.println("The area of the circle is " + area);

            }

        }







    }
}