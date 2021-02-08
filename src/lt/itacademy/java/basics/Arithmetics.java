package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetics {
    public static void cubeVolumePerimeter() {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the side of cube:");
        double side = s.nextDouble();
        double volume = side * side * side;
        double perimeter = 12 * side;
        System.out.println("Cube’s volume: " + volume);
        System.out.println("Cube’s perimeter: " + perimeter);
        s.close();
    }


    public static void featInchesToCentimeters() {

        Scanner my_scan = new Scanner(System.in);
        System.out.print("Inputs: ");
        double feet = my_scan.nextDouble();
        double inch = my_scan.nextDouble();
        double centimeters = (feet * 30.48) + (inch * 2.54);
        System.out.println(centimeters);

    }
}