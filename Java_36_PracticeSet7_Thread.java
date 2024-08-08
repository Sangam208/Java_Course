package com.company;

// Question 1
class IsThread1 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Good Morning!!");
//            System.out.println(this.getName());
        }
    }
}

class IsThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("Welcome!!");
            i++;
//            Question 2
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
//        Question 5
        System.out.println(Thread.currentThread().getState());
    }
}

public class Java_36_PracticeSet7_Thread {
    public static void main(String[] args) {
        IsThread1 t1 = new IsThread1();
        IsThread2 t2 = new IsThread2();
//        Question 3
//        t1.setPriority(6);
//        t2.setPriority(8);
//        System.out.println("Priority of t1 = "+t1.getPriority());
//        System.out.println("Priority of t2 = "+t2.getPriority());

//        Question 4
        System.out.println(t1.getState());
//        t1.start();
        t2.start();
        System.out.println(t2.getState());

    }
}
