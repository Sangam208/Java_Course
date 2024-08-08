package com.company;

interface Vehicle2{
    default void checkDef1(){
        System.out.println("This is default method in interface");
    }
    default void checkDef2(){
        System.out.println("This is default method in interface");
    }
}

class Car2 implements Vehicle2{
    public void checkDef2(){
        System.out.println("This default method is overwritten!!");
    }
}

public class Java_25_Default_Methods {
    public static void main(String[] args) {
        Car2 c2 = new Car2();
        c2.checkDef1();
        c2.checkDef2();
    }
}
