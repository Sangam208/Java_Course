package com.company;

public class Java_14_VarArgs {

//    variable arguments ---> ...arr ---> behaves as an array

    static int add(int x, int ... arr){
        int sum = x;
        for (int a: arr){
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {

//        Works for int ...arr parameter only
//        System.out.println(add());

        System.out.println(add(3));  // Must consist of at least on argument
        System.out.println(add(3,4,12,2,42,6));
    }
}
