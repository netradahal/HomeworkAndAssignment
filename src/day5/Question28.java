package day5;

public class Question28 {
    public static void main(String[] args) {
        isPrimeNumber(9);

    }

    public static void isPrimeNumber(int input){
        //971
        if(input !=2 && input % 2 == 0){
            System.out.println("Not a prime number!");
        }
    }
}
