package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "This is toString() call";
    }

    @Override
    public String getMessage() {
        return "This is getMessage() call";
    }
}

public class Java_41_Exception_Class {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any value for a: ");
        int a = s.nextInt();
        if (a<9){
            try{
//                throw new MyException();
                throw new ArithmeticException("This is an exception");
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
//                System.out.println(e); // runs toString()
                e.printStackTrace();
            }
        }
    }
}
