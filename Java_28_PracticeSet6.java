package com.company;

//Q1
//abstract class Pen{
//    abstract void write();
//    abstract void refill();
//}

//Q2
//class FountainPen extends Pen{
//    void write(){
//        System.out.println("Fountain Pen is ready to write!!");
//    }
//    void refill(){
//        System.out.println("Please refill!!");
//    }
//    void changeNib(){
//        System.out.println("Nib has been changed!!");
//    }
//}

//Q3
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){
        System.out.println("Jumping the tree!!");
    }
    void bite(){
        System.out.println("Biting the food!!");
    }
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Humans speak!!");
    }
    public void eat(){
        System.out.println("Humans eat!!");
    }
    public void sleep(){
        System.out.println("Humans sleep!!");
    }
}
public class Java_28_PracticeSet6 {
    public static void main(String[] args) {
//        FountainPen f = new FountainPen();
//        f.write();
//        f.refill();
//        f.changeNib();

        Human h = new Human();
        h.eat();
        h.bite();
        h.jump();
        h.sleep();
        h.speak();

//        Q5
        Monkey m1 = new Human(); // human object but reference given as a monkey
        m1.bite();
//        m1.speak(); // not allowed
        BasicAnimal b1 = new Human(); // human object but reference of a basic animal
        b1.eat();
        b1.sleep();
//        b1.speak(); // not allowed

    }
}
