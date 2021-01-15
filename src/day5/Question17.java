package day5;

import java.util.Scanner;

public class Question17 {


    public static void main(String[] args) {

        System.out.println("Enter a year to check if it is leap year\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("%d ,year");
        int year = scanner.nextInt();
        if (year%400==0) //Exactly divisible by 400
            System.out.println("%d is a leap year");
         if  ( year%100==0) // exactly divisible by 100 and not by 400
            System.out.println("%d isn't leap year");




    }
}
