package com.company;

@FunctionalInterface // this ensures existence of an interface with only one non-overriding method
interface functionalInterface{
    public void method();
}

class D extends A{
    @Override
    public void call(){
        System.out.println("D called!!");
    }
    @Deprecated
//    @SuppressWarnings("deprecated")
    public float divide(int a, int b){
        return (float)a/b;
    }
}
public class Java_Advanced2_58_Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        D d = new D();
        d.call();
        System.out.println(d.divide(3,4));
    }
}
