// Constructor concepts in Inheritance
package com.company;

class Base{
    Base(){
        System.out.println("This is base class constructor!!");
    }
    Base(int a){
        System.out.println("This is base class constructor with value of a = "+a+"!!");
    }
}

class Derived1 extends Base{
    Derived1(){
        System.out.println("This is derived1 class constructor!!");
    }
    Derived1(int a, int b){
        super(a);
        System.out.println("This is derived1 class constructor!!");
        System.out.println("a = "+a+"\tb = "+b);
    }
}

class Derived2 extends Base{
    Derived2(){
        super(19);
        System.out.println("This is derived class constructor!!");
    }
}

class ChildDerived1 extends Derived1{
    ChildDerived1(){
        System.out.println("This is constructor for child class of derived1 class!!");
    }
    ChildDerived1(int a, int b, int c){
        super(a,b);
        System.out.println("This is constructor for child class of derived1 class!!");
        System.out.println("a = "+a+"\tb = "+b+"\tc = "+c);
    }
}

public class Java_19_Inheritance {
    public static void main(String[] args) {
//        Base b = new Base();
//        Derived1 d1 = new Derived1();
//        Derived2 d2 = new Derived2();
        ChildDerived1 cd1 = new ChildDerived1(2,3,4);
    }
}
