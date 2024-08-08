package com.company;

class Base1{
    public int a = 21;
    int b = 32;
    protected int c = 45;
    private int d = 14;
    void show(){
        System.out.println("All access modifiers are allowed to access directly inside class:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class Java_30_Access_Modifiers {
    public static void main(String[] args) {
        Base1 obj = new Base1();
        obj.show();

        System.out.println("Private access modifiers not allowed to access directly within a package:");
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
//        System.out.println(obj.d); // throws an error because private members can not be accessed directly
    }
}
