package com.company;

interface Vehicle{
    int a = 3;
    void name(String brand);
    void mh(float mega_hz);
}

interface Passengers{
    void checkStatus(String s);
    default void applyDef(){
        System.out.println("This is default function call in interface");
    }
}

// Class can be formed from multiple interfaces but in java such can not be done from multiple classes
class Car implements Vehicle, Passengers{
    private String carBrand, status;
    private float mileage;

//    While implementing methods of an interface, public modifier should only be used
    public void name(String carName){
        carBrand = carName;
    }
    public void mh(float mhz){
        mileage = mhz;
    }
    void display(){
        System.out.println(carBrand+" gives a mileage of "+mileage+" miles per hour");
    }
    public void checkStatus(String s){
        status = s;
        if (status.equalsIgnoreCase("r") || status.equalsIgnoreCase("rich")){
            System.out.println("Affordable!!");
        }else{
            System.out.println("It seems you can not afford this vehicle!!");
        }
    }
}

public class Java_24_Interface {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name("Mercedes");
        c1.mh(35.4f);
        c1.display();
        c1.checkStatus("Rich");
//        c1.checkStatus("uehrfa");

        System.out.println(c1.a); // allowed
//        c1.a = 4; // not allowed because properties in interfaces are final
    }
}
