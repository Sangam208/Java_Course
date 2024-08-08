package com.company;

import java.io.IOException;

public class Java_39_Specific_Exception {
    public static void main(String[] args) {
        int []marks = new int[4];
        marks[0] = 43;
        marks[1] = 24;
        marks[2] = 64;
        marks[3] = 72;

        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("Enter any array index: ");
        int indx = s.nextInt();
        System.out.print("Enter number to divide the array-value with: ");
        int num = s.nextInt();
        try {
            System.out.println("Value at index-"+indx+" is "+marks[indx]);
            System.out.println("array-value/number = "+marks[indx]/num);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException Occured!!\n"+e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundException Occured!!\n"+e);
        }catch(Exception e){
            System.out.println("Some Other Exception Occured ---> "+e);
        }


    }
}
