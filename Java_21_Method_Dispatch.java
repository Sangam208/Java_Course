package com.company;

class Mobile{
    void time(){
        System.out.println("3:45 pm");
    }
    void type(){
        System.out.println("This is normal mobile!!");
    }
}

class TouchMobile extends Mobile{
    void music(){
        System.out.println("Playing music...");
    }
    void type(){
        System.out.println("This is touch-screen mobile!!");
    }
}

public class Java_21_Method_Dispatch {
    public static void main(String[] args) {
//        Dynamic Method Dispatch
//        Runtime Polymorphism
        Mobile mb = new TouchMobile();
//        TouchMobile b = new Mobile(); // This is not allowed
        mb.time();
        mb.type();  // calls type() function of TouchMobile class since mb is object of TouchMobile class
//        mb.music();  // Not allowed
    }
}
