package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {

    static void checkTriangle() {
        Scanner my_scan = new Scanner(System.in);
        System.out.print("Inputs: ");
        int x = my_scan.nextInt();
        int y = my_scan.nextInt();
        int z = my_scan.nextInt();

        // Check for equilateral triangle
        if (x == y && y == z)
            System.out.println("Triangle is Equilateral. Sides: " + x + " " + y + " " + z + " ");

            // Check for isoceles triangle
        else if (x == y || y == z || z == x)
            System.out.println("Triangle is Isoceles. Sides: " + x + " " + y + " " + z + " ");

            // Otherwise scalene triangle
        else
            System.out.println("Triangle is Scalene. Sides: " + x + " " + y + " " + z + " ");
    }

    static void carGasTravelMeter() {

        Scanner my_scan = new Scanner(System.in);
        System.out.print("Inputs: ");
        int distance = my_scan.nextInt();
        double fuel = my_scan.nextDouble();
        double usage = my_scan.nextDouble();
        double price = my_scan.nextDouble();

        if (fuel < usage) {
            System.out.println("Destination is in " + distance + "km." + " Car is not able to reach the destination. " + "It needs " + (usage - fuel) + " liter of fuel more. " + "It will cost " + (usage - fuel) * price);
        } else if (usage <= fuel) {
            System.out.println("Destination is in " + distance + "km." + " Car is able to reach the destination. " + "It will have " + Math.abs(((usage / 100) * distance) - fuel) + " liters of fuel left");
        }

    }

}
