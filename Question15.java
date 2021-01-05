package day5;

import java.util.Scanner;

public class Question15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter ASCII code
        //(an integer between 0 and 128)
        System.out.println("Enter the ASCII code");
        int value = scanner.nextInt();
         // Display ASCII code as character
        System.out.println((char) value);

    }
}
