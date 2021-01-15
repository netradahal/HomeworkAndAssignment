package day5;

import java.util.Scanner;

public class Question28  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        if (isPrime(n)){


            System.out.println(n + "is a prime number");
        }else {
            System.out.println(n + "is a not a prime number");

        }


    }
}
