package com.company;
import java.util.Scanner;

public class Java_03_input {
    public static void main(String[] args) {

        // Taking input using Scanner class

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int mul=1,a = s.nextInt();
        for (int i = 1; i <= a; i++) {
            mul *= i;
        }
        System.out.println("Factorial of "+a+" = "+mul);

        boolean b = s.hasNextInt();
        System.out.println(b);

//        String str1 = s.next();
//        to print string after white spaces
//        String str1 = s.nextLine();
//        System.out.println(str1);
    }
}