package com.company;

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int i=12;
        System.out.println("Welcome!!");
//        while(true){
//            System.out.println("This is a thread!!");
//        }
    }
}

class MyThread3 implements Runnable{
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+" ------> "+(i+1));
        }
//        while(true){
//            System.out.println("This is thread3!!");
//        }
    }

}

public class Java_33_Thread_Constructor {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("No one");
        mt1.start();
        System.out.println("Id of thread mt1 is "+mt1.threadId());
        System.out.println("Name of thread mt1 is "+mt1.getName());

        MyThread mt2 = new MyThread("Nobody");
        mt2.start();
        System.out.println("Id of thread mt2 is "+mt2.threadId());
        System.out.println("Name of thread mt2 is "+mt2.getName());

        MyThread3 t1 = new MyThread3();
        Thread th1 = new Thread(t1,"Nothing");
        th1.start();
    }
}
