package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class Java_Advanced1_52_Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());

//        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Nepal"));
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.getTimeZone().getID());


    }
}
