package com.company;

import java.util.Scanner;

public class Java_37_Exceptions_Errors {
    public static void main(String[] args) {
//        a=2; // Syntax Error ---> a not declared

//        Logical Error
//        printing prime number from 1 to 12
//        System.out.println(2);
//        for (int i = 1; i <5 ; i++) {
//            System.out.println(2*i+1); // This prints non-prime numbers as well which is a logical error
//        }

//        Runtime Error
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        System.out.println("Result = "+10/n);

    }
}
