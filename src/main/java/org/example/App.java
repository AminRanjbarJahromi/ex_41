package org.example;

// 1. Write a Java program to print 'Hello' on screen and then print your name on
//a separate line.

public class App {

    public static void main(String[] args){
        System.out.println(" Hello");
        System.out.println(" Amin");






        double num1 = 41 , num2 = 10 , result = 0;
        char operator = '+';
        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("operator is not valid");
        }
        System.out.println(result);
    }

}



