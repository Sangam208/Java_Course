package com.company;
import java.util.Scanner;

// Finding percentage of a student in 5 subjects

public class Java_04_exercise1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks of student in ");
        float marks1 = s.nextFloat();
        float marks2 = s.nextFloat();
        float marks3 = s.nextFloat();
        float marks4 = s.nextFloat();
        float marks5 = s.nextFloat();

        float total_marks = marks1+marks2+marks3+marks4+marks5;
        float percentage = total_marks/5;

        System.out.println("Total Percentage = "+percentage+"%");

        if(percentage>=35){
            System.out.println("PASS!!");
        }else{
            System.out.println("FAIL!!");
        }
    }
}
