package day5;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float radius = scanner.nextFloat();
        double perimeterOfCircle = 2*(Math.PI*radius);
        System.out.println("Perimeter of circle is: " + perimeterOfCircle);

        System.out.println("Enter length of triangle");
        float length = scanner.nextFloat();
        System.out.println("Enter ");
        double perimeterOfTriangle = 3*(length);
        System.out.println("Perimeter of triangle is: " + perimeterOfTriangle);

        System.out.println("Enter length of rectangle");
        float lengthOfRectangle = scanner.nextFloat();
        System.out.println("Enter width of rectangle");
        float widthOfRectangle = scanner.nextFloat();
        double perimeterOfRectangle = 2*(lengthOfRectangle + widthOfRectangle);
        System.out.println("perimeter of rectangle is:" + perimeterOfRectangle);








    }


}

