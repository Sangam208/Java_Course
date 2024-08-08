package com.company;
import java.util.Scanner;
//import java.util.*;

public class Java_29_Packages {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//        Without importing Scanner
//        java.util.Scanner s = new java.util.Scanner(System.in);
        int a = s.nextInt();
        System.out.println("Entered value = "+a);
    }
}
