package com.company;

public class Java_43_Finally {
    public static int divide(int a, int b){
        try {
            return a/b;
        }catch (Exception e){
            System.out.println(e);
        }finally {
//            Any message inside finally block will be printed compulsorily
            System.out.println("Exiting the function......");
        }
//        System.out.println("This will not print");
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(divide(5,2));
    }
}
