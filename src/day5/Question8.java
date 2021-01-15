package day5;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter degree in fahrenheit");
        double userfahrenheit = scanner.nextDouble();

        System.out.println("Enter degree in celsius");
        double usercelsius = scanner.nextDouble();

        double celsius = 5*(userfahrenheit - 32 ) / 9.0;
        double fehrenheit = 9*(usercelsius + (32*5)) /5;
        System.out.println(userfahrenheit + "degree Fahrenheit is equal to" + celsius + "degree");
        System.out.println(usercelsius + "degree Celsius is equal to" + "fahrenheit" + "degree" );



    }
}
