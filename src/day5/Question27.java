package day5;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Question27 {

    public static void main(String[] args) {
        //12345, 234, 456, 5689, 123456
        // char = [1,2,3,4,5]
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some numbers to add and multiply: ");
        String input = scanner.next();
        int sum = 0;
        int product = 1;

        for(int i=0; i < input.length(); i++){
            int num = Character.getNumericValue(input.charAt(i));
            sum = sum + num;
            product = product * num;
        }

        System.out.println("The sum of number is: " + sum);
        System.out.println("The product of number is: " + product);

    }
}
