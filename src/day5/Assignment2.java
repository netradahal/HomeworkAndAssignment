package day5;

import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius for a circle: ");
        float radius = scanner.nextFloat();
        double areaOfCircle = (Math.PI) * (radius * radius);
        System.out.println("The area of circle is: " + areaOfCircle);


        System.out.println("Enter length of a rectangle: ");
        float LengthOfRect = scanner.nextFloat();
        System.out.println("Enter width of a rectangle");
        float WidthOfRect = scanner.nextFloat();
        double areaOfRect = 2 * (LengthOfRect + WidthOfRect);
        System.out.println("The area of rectangle is:" + areaOfRect);

        System.out.println("Enter Height of a triangle");
        Float HeightOfTriangle = scanner.nextFloat();
        System.out.println("Enter Base of a triangle");
        Float BaseOfTriangle = scanner.nextFloat();
        double AreaOfTriangle = (HeightOfTriangle * BaseOfTriangle)/2;
        System.out.println("The area of Triangle is:" + AreaOfTriangle);






    }
}
