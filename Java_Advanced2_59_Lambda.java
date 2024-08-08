package com.company;

@FunctionalInterface
interface DemoAno{
    void method(int x);
}

//class MyFunction implements DemoAno{
//    @Override
//    public void method() {
//        System.out.println("This is method override in MyFunction class");
//    }
//}

//class AnoDemo implements DemoAno{
//    @Override
//    public void method() {
//        System.out.println("This is a method");
//    }
//}

public class Java_Advanced2_59_Lambda {
    public static void main(String[] args) {
//        DemoAno a = new AnoDemo();
//        a.method();

//        Overriding method() by using Anonymous class
//        Anonymous class is a class with no name
//        DemoAno d = new DemoAno() {
//            @Override
//            public void method() {
//                System.out.println("This is a method");
//            }
//        };
//        d.method();

//        Lambda Expressions
//        We use Lambda Expressions to override a method without creating object of a class
//        DemoAno d1 = new MyFunction();
//        d1.method();
        DemoAno obj = (a)->{System.out.println("I am method through lambda expressions "+a);};
        obj.method(6);
    }
}