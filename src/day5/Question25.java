package day5;

import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String name1;
        String name2;
        String maxName1 = "";
        String maxName2 = "";
        double maxScore = -1;
        double score;
        System.out.println("Enter the number of student");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Student" + i + "of" + num);
            System.out.println("Enter student's name");
            name1 = scanner.next();
            name2 = scanner.next();
            System.out.println("Enter student's score");
            score = scanner.nextDouble();
            if ( score> maxScore){
                maxScore = score;
                maxName1 = name1;
                maxName2 = name2;

            }
        }
          String maxScore1;
        if(Math.round(maxScore * 100)%10==0) maxScore1=maxScore + "0";
        else maxScore1 = maxScore + "";
        System.out.println("The highest score was" + maxScore1 + "and" + maxName1+ "" + maxName2+ "got it");
    }
}