package day7;
import  javax.swing.*;

public class WhileLoopDemo2 {
    public static void main(String[] args) {
        boolean flag = true;

        while (flag) {
            String name = JOptionPane.showInputDialog("Enter name");
            System.out.println("Name is:" + name);
            if (name.equals("netra")) {
                flag = false;


            }
            System.out.println("exit"); }
        }
    }



