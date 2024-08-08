package com.company;
import java.util.Scanner;

class Student{
    int roll;
    String name;
    void set(int r, String n){
        roll = r;
        name = n;
    }
    void get(){
        System.out.println("Name:\t"+name+"\nRoll No:\t"+roll);
    }
}

public class Java_16_Class {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of the student and roll no:");
        String s_name = input.nextLine();
        int roll_no = input.nextInt();
        s.set(roll_no, s_name);
        s.get();
    }
}
