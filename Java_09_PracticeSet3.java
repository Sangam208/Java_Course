package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Java_09_PracticeSet3 {
    public static void main(String[] args) {

//        Question 1
//        Printing pattern:
//        ****
//        ***
//        **
//        *

        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }


//        Question 2
//        Sum of n even numbers

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the value of n: ");
//        int sum = 0;
//        int n = input.nextInt();
//        for (int i = 1; i <= n; i++) {
//            sum += 2*i;
//        }
//        System.out.println("Sum of first "+n+" even numbers is: "+sum);


//        Question 3,4 and 5
//        Multiplication table and that in reverse order

        System.out.println("Enter a number: ");
        byte num = input.nextByte();
        System.out.println("Multiplication table of "+num+":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" * "+i+" = "+num*i);
        }

        System.out.println("*****************\nMultiplication table in reverse order:");
        for (int i = 10; i > 0; i--) {
            System.out.println(num+" * "+i+" = "+num*i);
        }
//        Factorial of the number
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of "+num+" is "+factorial);
    }
}
