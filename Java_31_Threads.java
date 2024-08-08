// Extending Thread Class
package com.company;

class MyThread1 extends Thread{
    int i;
    public void run(){
        while (i<20){
            System.out.println("MyThread1 Running......");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    int i=0;
    public void run(){
        while (i<20){
            System.out.println("MyThread2 Running......");
            i++;
        }
    }
}

public class Java_31_Threads {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
