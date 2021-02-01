package com.company;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner commandLine = new Scanner(System.in);
        System.out.print("Input two numbers and an operand... ");
        int n1 = commandLine.nextInt();
        int n2 = commandLine.nextInt();
        char c = commandLine.next().charAt(0);

        switch (c) {
            case '+' : System.out.println(n1 + n2);
            break;
            case '-' : System.out.println(n1 - n2);
            break;
            case '*'  : System.out.println(n2 * n2);
            break;
            case '/'   : if (n2==0){
                System.out.println("you can't divide the number by zero");
            } else {
                System.out.println(n1 / n2); }
            break;
            case '%'  :  if (n2==0){
                System.out.println("you can't divide the number by zero");
            } else {
                System.out.println(n1 % n2); }
            break;

            default  : System.out.println("You can't input anything but these (+ ,- , *, / , %)operands");
        }


    }
}
