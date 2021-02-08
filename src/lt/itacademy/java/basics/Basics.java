package lt.itacademy.java.basics;

import java.util.Scanner;

import static lt.itacademy.java.basics.Arithmetics.cubeVolumePerimeter;
import static lt.itacademy.java.basics.Arithmetics.featInchesToCentimeters;
import static lt.itacademy.java.basics.Calculator.calculator;
import static lt.itacademy.java.basics.Loops.*;
import static lt.itacademy.java.basics.Operators.carGasTravelMeter;
import static lt.itacademy.java.basics.Operators.checkTriangle;

public class Basics {

    public static void main(String[] args) {

//        taskOne();
//        taskTwo();
//        taskTree();
//        cubeVolumePerimeter();
//        featInchesToCentimeters();
//        checkTriangle();
//        carGasTravelMeter();
//        getYearForLoop();
//        getYearLoopTwo();
//        getFactionalOfNumber();
        calculator();


    }

    public static void taskOne() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ivesk savo varda: ");
        String name = scan.nextLine();

        System.out.println("Ivesk savo pavarde: ");
        String surname = scan.nextLine();

        System.out.println("Ivesk savo amziu: ");
        String age = scan.nextLine();

        System.out.println("Hello I am " + name + " " + surname + " " + age + " " + "I am attending IT Academy 2021!");
    }

    public static void taskTwo() {

        char symbol = 'H';
        short numberSecond = 3110;
        char symbolTwo = 'w';
        byte numberThird = 0;
        char symbolThree = 'r';
        int numberFourth = 1;
        char symbolFour = 'd';
        float number = 2.0f;
        boolean test = true;

        System.out.println(symbol + String.valueOf(numberSecond) + " " + symbolTwo + String.valueOf(numberThird) + symbolThree + numberFourth + symbolFour + " " + symbolFour + number + " " + true);
    }

    public static void taskTree() {
        int x = 3;
        int y = 2;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x * y);
        System.out.println(Math.min(x, y));
        System.out.println(Math.max(x, y));
        System.out.println(Math.abs(x));
        System.out.println(Math.abs(y));

    }
}

