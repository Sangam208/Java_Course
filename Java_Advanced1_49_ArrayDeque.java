package com.company;

import java.util.ArrayDeque;

public class Java_Advanced1_49_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrd1 = new ArrayDeque<>();
        arrd1.add(32);
        arrd1.add(12);
        arrd1.add(54);
        arrd1.add(48);
        arrd1.addFirst(4);
        System.out.println(arrd1.getFirst());
        System.out.println(arrd1.getLast());

    }
}
