package day5;

import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        int count, temp;

        // User inputs the array size
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements you want in array:");
        count = scanner.nextInt();

        int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++) {
            num[i] = scanner.nextInt();
        }


        scanner.close();
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {


                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;

                }
            }
        }
        System.out.println("Array Elements in Ascending Order");
        for (int i = 0; i < count - 1; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[count - 1]);
    }
}

