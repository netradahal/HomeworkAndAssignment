package day5;

import java.util.Scanner;

public class Question31 {

    public static void main(String[] args) {

        int i,j,n;
        System.out.println("Input number of rows:");
        Scanner scanner = new Scanner(System.in);
         n  = scanner.nextInt();
        for (i=1; i<=n; i++)
        {
            for (j=1; j <=i; ++j);
            System.out.println(" ");
        }



    }
}
