package day10;

public class User {

    String name;
    int age;

    public  User () {
        System.out.println("constructor called");
    }
    public void displayInfo() {
        System.out.println("Name is: +name");
        System.out.println("Age is; + age");

    }

    public static void main(String[] args) {
        User user1 = new User();
        user1.displayInfo();
    }




}
// constructor: is a special function which has
//following features:
//1. it's name is same as class name
//2. it has no return type
//3. we can not use 'void' keyword too
//4. it is mainly used to initialize the number's data
//5. it runs only once for each object
//6. it can have any access modifier

