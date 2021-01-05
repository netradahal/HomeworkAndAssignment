package day5;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter negative number");
        int value = scanner.nextInt();
        if(value >= 0){
            System.out.println("please try again!");
        }else{
            System.out.println("you have entered :" + value);
        }
    }
}
