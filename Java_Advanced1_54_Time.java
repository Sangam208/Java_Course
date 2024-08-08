// java.time API
package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Java_Advanced1_54_Time {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy E HH:mm::ss a"); // This is not a date, it is just a formatter
        String date = dt.format(f);
        System.out.println(date);
    }
}
