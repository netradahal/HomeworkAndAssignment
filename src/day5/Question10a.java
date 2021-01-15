package day5;

import java.util.Scanner;

public class Question10a {
    public static void main(String[] args) {

            //u*t+0.5*a*t*t
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter velocity");
        int velocity = scanner.nextInt();
        System.out.println("enter time");
        int time = scanner.nextInt();
        System.out.println("enter acceleration");
        int acceleration = scanner.nextInt();
        double speed = (velocity*time + 0.5*acceleration*time*time);
        System.out.println("speed is "  + speed);

    }
}
