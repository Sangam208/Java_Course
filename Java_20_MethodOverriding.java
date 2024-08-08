package com.company;

class A{
    void call(){
        System.out.println("A called!!");
    }
}

class B extends A{
    @Override
    void call(){
        System.out.println("B called!!");
    }
}

class C extends A{ }

public class Java_20_MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.call();

        B b = new B();
        b.call();

        C c = new C();
        c.call();


    }
}
