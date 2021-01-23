package day9;

public class StaticNonStaticDemo {

    String nonStaticVar = "this is non-static variable.";
    static String staticVar = "this is static variable";

    public void nonStaticMethod(){
        System.out.println("This is non-static method...");

    }

    public void StaticMethod(){
        System.out.println("This is static method...");



    }
    public static void main(String[] args) {
      StaticNonStaticDemo ob = new StaticNonStaticDemo();
      ob.nonStaticMethod();
        System.out.println(ob.nonStaticVar);



    }
}
