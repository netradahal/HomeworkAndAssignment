package day8;

import javax.swing.*;

public class MethodDemo1 {
    //<access modifier> void <method name> (zero to any number of arguments) {
    //========
    //====
    //======}
    // method declaration

    public void greet() {
        System.out.print("Hello");
        System.out.println("Good Morning");

    }
public void displayInfo(String name, int age, String address) {
    System.out.println("Name is " + name);
    System.out.println("Age is " + age);
    System.out.println("Address is " + address);

}

    public static void main(String[] args) {
        System.out.println("main start");
        MethodDemo1 ob = new MethodDemo1();
        //method calling
        ob.greet();

        String name = JOptionPane.showInputDialog("Enter Name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age"));
        String address = JOptionPane.showInputDialog("Enter Address");
        //method calling
        ob.displayInfo(name, age, address);
        System.out.println("main end");

    }
}


//OOPS concept

//Phase-1
//Class/Non-static concept
//Constructor and method
//This concept


//Phase-2
//Encapsulation(getter/setter)
//Inheritance
//Super
//Abstract class
//Interface
//Polymorphism

//Access modifier(private public protected default)
