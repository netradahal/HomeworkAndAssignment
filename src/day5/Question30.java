package day5;

public class Question30 {

    public static void main(String[] args) {
        int count = 7, num1 = 0, num2 = 1;
        System.out.println("Fibonacci Series of "+count+" numbers:");
        for (int i = 1; i <= count; ++i) {
            System.out.println(num1+ " ");

            /* on each iteration, we are assigning second number
            * to the first number and assigning the sum of last two
            * number to the second number
             */
            int sumofPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumofPrevTwo;
        }

    }

}
