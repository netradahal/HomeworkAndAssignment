package day5;

import java.util.Scanner;

public class Question20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what would you like to do: A for Addition, S for Subtraction, M for multiplication, " +
                "and D for Division");
        String operation = scanner.next();
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        switch (operation){
            case "A":
                System.out.println("Adding two numbers: " + (num1 + num2));
                break;

            case "S":
                System.out.println("Subtracting two numbers: " + (num2 - num1));
                break;

            case "M":
                System.out.println("Multiplying two numbers: " + (num1 * num2));
                break;

            case "D":
                System.out.println("Dividing two numbers: " + (num1/num2));
                break;

            default:
                System.out.println("Please select the correct option!");

        }

    }
}
