package day7;

public class ContinueDemo {
    public static void main(String[] args)  { args: {}
        for (int i = 0; i <=5; i++) {
            if (i==3){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("exit");



    }
}