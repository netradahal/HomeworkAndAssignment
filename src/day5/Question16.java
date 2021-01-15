package day5;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter even number");
        int number = scanner.nextInt();
        if (number %2 == 0){

            System.out.println("%d is even" +number);
        }else{
            System.out.println("%d is odd" +number);
        }

    }
}
