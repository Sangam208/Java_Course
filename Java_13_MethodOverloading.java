package com.company;

import javax.swing.*;

public class Java_13_MethodOverloading {

//    Method overloading using no parameter and parameter
    static void greet(){
        System.out.println("Hello There!! This is static greeting with no value!!\n");
    }

    static void greet(int a){
        System.out.println("Hello There!! This is static greeting with value 4!!");
    }

//    Method overloading using parameters of different data types

    static void speak(int a){
        System.out.println("\nInteger Speaking!!");
    }

    static void speak(String name) {
        System.out.println(name+" Speaking!!\n");
    }

//    Method overloading can not be done by using different return types
//    static int speak(int a){} ---> Throws error

//    Recursion/Recursive function
    static int factorial(int n){
        if (n == 0 || n==1) {
            return 1;
        }else{
            return n*factorial(n-1);
        }

    }

    static int fibonacci(int n){
        if (n <=1) {
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci((n-2));
        }

    }

    public static void main(String[] args) {

//        Method overloading
        greet();
        greet(4);

        speak(1);
        speak("Computer");

//        Using recursion for finding factorial of a number
        System.out.println(factorial(5));
        for (int i = 0; i <= 5; i++) {
            System.out.print(fibonacci(i)+"\t");
        }

    }
}
