// Implementing Runnable interface Thread
package com.company;

class MyThreadRun1 implements Runnable{
    int i=0;
    public void run(){
        while(i<40){
            System.out.println("This is thread 1!!");
            i++;
        }
    }
}

class MyThreadRun2 implements Runnable{
    int i=0;
    public void run(){
        while(i<40){
            System.out.println("This is thread 2!!");
            i++;
        }
    }
}

public class Java_32_Interface_Thread {
    public static void main(String[] args) {
        MyThreadRun1 bullet1 = new MyThreadRun1();
        MyThreadRun2 bullet2 = new MyThreadRun2();

//        In Runnable interface, start() can not be used directly
//        bullet11.start();
//        bullet2.start();
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
