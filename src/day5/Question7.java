package day5;

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height of cylinder");
        float height = scanner.nextFloat();
        System.out.println("Enter radius of cylinder");
        float radius = scanner.nextFloat();
        double volumeOfCylinder = Math.PI * radius*radius*height;
        System.out.println("The volume of cylinder is; " + volumeOfCylinder);
    }
}
