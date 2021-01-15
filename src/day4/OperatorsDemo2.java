package day4;

public class OperatorsDemo2 {

    public static void main(String[] args) {

        //3. Increment/decrement Operator
        //++ --
        //post pre
        //a++ a-- ++a --a
        int i =5;
        System.out.println(i);
        ++ i;//i = i + 1;
        System.out.println(i);

        int a = 7;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);

        int m = 8;
        int n = m ++;
        System.out.println(m);
        System.out.println(n);


    }
}
