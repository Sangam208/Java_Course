package com.company;
import java.util.Scanner;

public class Java_05_PracticeSet1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//        Converting kilometers to meters
//        System.out.println("Enter distance in kilometers: ");
//        double km = s.nextDouble();
//        System.out.println(km+" kilometers = "+(1000*km)+" meters");

//        Checking whether entered number is integer or not
        System.out.println("Enter a number to be checked: ");
        boolean b = s.hasNextInt();
        System.out.println(b);

//        Grade encrypting by adding 8
        char grade = 'A';
        grade = (char)(grade+8);
        System.out.println(grade);

//        Decrypting grade
        grade = (char)(grade-8);
        System.out.print(grade);


    }
}
/*
    Result = byte + short -> integer
    Result = short + integer -> integer
    Result = long + float -> float
    Result = integer + float -> float
    Result = character + integer -> integer
    Result = character + short -> integer
    Result = long + double -> double
    Result = float + double -> double
*/
