package day9;

public class StaticNonStaticTest {
    public static void main(String[] args) {
        StaticNonStaticDemo obj = new StaticNonStaticDemo();
        System.out.println(obj.nonStaticVar);
        obj.nonStaticMethod();

        System.out.println(StaticNonStaticDemo.staticVar);



    }
}
