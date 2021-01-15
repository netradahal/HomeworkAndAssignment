package day5;

public class Question11a {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int temp = x;
        x = y;
        y = temp;

        System.out.println("after swaping:"  + "x = "+x+",  y = "+y);
    }
}
