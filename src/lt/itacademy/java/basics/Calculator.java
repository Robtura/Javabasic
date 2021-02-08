package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {

    public static void calculator() {

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter shape: ");
//        String shape = scanner.next();
////        double second = scanner.nextDouble();
//
        double perimeter;
        double area;
        double squareNumber = 3;
        String answer;

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter shape: ");
            String shape = scanner.next();

            switch (shape) {
                case "Triangle":
                    double first = scanner.nextDouble();
                    perimeter = first + first + first;
                    area = first * Math.sqrt(squareNumber) / 2;

                    if (perimeter < 0) {
                        System.out.println("Rectangle line value can’t be 0 or negative value.");
                    } else {
                        System.out.print("Triangle perimeter is " + perimeter + " and area is " + area + System.lineSeparator());
                        System.out.println("Continue? Y/N");
                    }
                    break;
                case "Rectangle":
                    double firstNumber = scanner.nextDouble();
                    double second = scanner.nextDouble();
                    perimeter = 2 * (firstNumber + second);
                    area = firstNumber * second;

                    if (perimeter < 0) {
                        System.out.println("Rectangle line value can’t be 0 or negative value.");
                    } else {
                        System.out.print("Rectangle perimeter is " + perimeter + " and area is " + area + System.lineSeparator());
                        System.out.println("Continue? Y/N");
                    }
                    break;
                case "Square":
                    double firstNumberTwo = scanner.nextDouble();
                    perimeter = firstNumberTwo * 4;
                    area = firstNumberTwo * firstNumberTwo;

                    if (perimeter < 0) {
                        System.out.println("Rectangle line value can’t be 0 or negative value.");
                    } else {
                        System.out.print("Square perimeter is " + perimeter + " and area is " + area + System.lineSeparator());
                        System.out.println("Continue? Y/N");
                    }
                    break;
                default:
                    System.out.println("Please give a figure and parameters.");

            }
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("Y"));
    }
}




