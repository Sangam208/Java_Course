package com.company;

abstract class Parent{
    Parent(){
        System.out.println("Parent constructor called!!");
    }
    void hello(){
        System.out.println("Hello!!");
    }
    abstract void greet();
}

class Child1 extends Parent{
    void greet(){
        hello();
        System.out.println("Halle Barry or Hallelujah!!");
    }
}

// Child2 does not contain greet() which is abstract method in Parent, so we must make abstract
abstract class Child2 extends Parent{
    void play(){
        System.out.println("Child2 is playing FIFA!!");
    }
}

public class Java_23_Abstract_Methods_Class {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.greet();
//        Child2 ch1 = new Child2(); // throws error since Child2 is an abstract class
//        Parent p1 = new Parent(); // throws error since Parent is an abstract class
    }
}
