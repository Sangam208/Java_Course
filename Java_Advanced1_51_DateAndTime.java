package com.company;
import java.util.Date;

public class Java_Advanced1_51_DateAndTime {
    public static void main(String[] args) {
        System.out.println("Milliseconds passes since 1 Jan 1970 --> "+System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        System.out.println(Long.MAX_VALUE);
        long check = System.currentTimeMillis();
        System.out.println(check);

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());

    }
}
