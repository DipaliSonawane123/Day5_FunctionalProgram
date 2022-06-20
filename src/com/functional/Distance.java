/*Write a program Distance.java that takes two integer command-line arguments x
        and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
        formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function*/
package com.functional;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x point");
        int x = scanner.nextInt();
        System.out.println("enter y point");
        int  y = scanner.nextInt();
        double  distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("The distance of the point from (" + x + ", " + y + ") to the origin is: " + distance);

    }
}

