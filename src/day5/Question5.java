package day5;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        System.out.println("Hello my name is Netra! i currently live in Pittsburgh, Pa");
        System.out.println("I am from eastern part of Nepal");
        System.out.println("I am licensed sales producer in insurance company");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number!");
        int value1 = scanner.nextInt();
        System.out.println("Enter second number!");
        int value2 = scanner.nextInt();
        int add = value1 + value2;
        System.out.println("The sum of two numbers is: " + add);

        System.out.println("Enter principal!");
        int principal = scanner.nextInt();
        System.out.println("Enter rate!");
        float rate = scanner.nextFloat();
        System.out.println("Enter time period!");
        int time = scanner.nextInt();


        double interest = (principal * time * rate) / 100;
        System.out.println("Interest is: " + interest );
        scanner.close();

    }
}
