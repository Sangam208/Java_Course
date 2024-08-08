package com.company;

interface MyBody{
    void process();
}

interface MyFace extends MyBody{
    void moisturizer();
}

class Hygiene implements MyFace{
//    This function should also be defined because MyFace is inherited from MyBody interface
    public void process(){
        System.out.println("Metabolism occurs inside the body!!");
    }
    public void moisturizer(){
        System.out.println("Moisturizer is needed for the face to prevent dry skin!!");
    }

}

public class Java_26_Inheritance_in_Interface {
    public static void main(String[] args) {
        Hygiene h1 = new Hygiene();
        h1.process();
        h1.moisturizer();
    }
}
