package day5;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter side 1");
        int s1 = scanner.nextInt();
        System.out.println("Enter side 2");
        int s2 = scanner.nextInt();
        System.out.println("Enter side 3");
        int s3 = scanner.nextInt();

        if(s1 == s2 && s2 == s3){
            System.out.println("equilateral triangle");
        }else if(s1 == s2 || s2 == s3 || s1 == s3){
            System.out.println("isosceles triangle");
        }else{
            System.out.println("Scalene triangle");
        }


    }
}

