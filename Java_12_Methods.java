package com.company;
import java.util.Scanner;


public class Java_12_Methods {

//    static function
//    static int factorial(int n){
//        int fact = 1;
//        for (int i = 1; i <= n; i++) {
//            fact *= i;
//        }
//        return fact;
//    }

//    Non-static function
    int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static void changeVal(int []arr){
        arr[0] = 10;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();
//        System.out.println("Factorial of "+num+" is "+factorial(num));

//        Calling a non-static method using object
        Java_12_Methods obj = new Java_12_Methods();
        System.out.println("Factorial of "+num+" is "+obj.factorial(num));

//        Elements of arrays can be changed using method because arrays are references for elements
        int []array = {12,21};
        changeVal(array);
        System.out.println(array[0]);
    }
}
