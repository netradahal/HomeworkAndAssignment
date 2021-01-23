package day5;

import java.util.Scanner;

public class Question38 {

    public static void main(String[] args) {
        System.out.println("Enter any string");
        Scanner in = new Scanner(System.in);

        // Original string
        String origString = in.next();
        int length = origString.length();

        boolean isPalindrome = true;

        for (int beginIndex = 0; beginIndex< length; beginIndex++)
        {
            if (origString.charAt(beginIndex) != origString.charAt(length-1-beginIndex)){
                System.out.println("String is not a palindrome");
                isPalindrome = false;
                break;

            }
        }

             if (isPalindrome){
                 System.out.println("String is a palindrome");
             }

    }
}
