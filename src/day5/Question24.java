package day5;

import java.util.Scanner;

public class Question24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number");
        // stored the entered value in variable
        int num = scanner.nextInt();
        // called the user defined function fact
        int factorial = fact(num);
        System.out.println("Factorial of entered number is: " + factorial);

    }

    static int fact(int n) {
        int output;
        if (n==1){
        return 1;
    }

    //Recursion: Function calling itself!
    output = fact(n - 1) * n;
    return output;
}
}