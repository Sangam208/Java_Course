package com.company;

public class Java_10_Arrays {
    public static void main(String[] args) {
        String []name = {"Harry", "Ron", "Hermione"};
        float []score = {8, 6.4f, 9.1f};

//        Printing names and scores in reverse order using for loop
        for (int i = name.length-1; i >= 0; i--) {
            System.out.println(name[i]+": "+score[i]);
        }
        System.out.println("\n");
//        Printing using for-each loop
        for (float element: score){
            System.out.println(element);
        }

    }
}
