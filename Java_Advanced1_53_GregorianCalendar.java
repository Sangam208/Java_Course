package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Java_Advanced1_53_GregorianCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.MONTH)+"-"+c.get(Calendar.DATE)+"-"+c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2026));
        System.out.println(TimeZone.getAvailableIDs()[65]);

    }
}
