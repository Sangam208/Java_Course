package com.company;

import org.w3c.dom.ls.LSOutput;

class MyNewThread extends Thread{
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("Running first.....");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}

class MyNewThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<34){
            System.out.println("Running second.....");
            i++;
        }
    }
}

public class Java_35_Thread_Methods {
    public static void main(String[] args) {
        MyNewThread t1 = new MyNewThread();
        MyNewThread1 t2 = new MyNewThread1();
        t1.start();
//        join could create exception so using try and catch block
//        try {
////            using join so that the second thread runs only after completion of the first
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}
