package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {

    static void getYearForLoop() {
        Scanner my_scan = new Scanner(System.in);
        System.out.print("Input: ");
        int days = my_scan.nextInt();
        int sum = 0;
        int sumTwo = 0;
        int hours = 25;
        int minutes = 1441;

        for (int e = 0; e < hours; e++)
            sum = e * days;
        for (int f = 0; f < minutes; f++)
            sumTwo = f * days;
        System.out.println("There are " + sum + " hours or " + sumTwo + " minutes in one year. ");

    }

    static void getYearLoopTwo() {

        Scanner my_scan = new Scanner(System.in);
        System.out.print("Input: ");
        int days = my_scan.nextInt();
        int sum = 0;
        int sumTwo = 0;
        int hours = 25;
        int minutes = 1441;
        int a = 0;
        int b = 0;

        while (a < hours) {
            sum = a * days;
            a++;
        }
        while (b < minutes) {
            sumTwo = b * days;
            b++;
        }
        System.out.println("There are " + sum + " hours or " + sumTwo + " minutes in one year. ");
    }

    static void getFactionalOfNumber() {

        Scanner my_scan = new Scanner(System.in);
        System.out.print("Input: ");
        int number = my_scan.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of number " + number + " is: " + fact);
    }
}


