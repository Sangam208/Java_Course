package com.company;

interface Wifi{
    void nameOfNetwork(String name);
}
interface Camera{
    void megapixels(float mp);
}

class SmartPhone implements Wifi,Camera{
    public void nameOfNetwork(String name){
        System.out.println(name+" network is being used!!");
    }
    public void megapixels(float mp){
        System.out.println(mp+" mega-pixels of camera!!");
    }
}

public class Java_27_Polymorphism_in_Interface {
    public static void main(String[] args) {
        Wifi sp = new SmartPhone(); // only Wi-fi methods allowed to use
        sp.nameOfNetwork("WorldLink"); // allowed

//        sp.megapixels(); // not allowed
    }
}
