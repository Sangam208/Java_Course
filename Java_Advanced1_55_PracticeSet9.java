package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Java_Advanced1_55_PracticeSet9 {
    public static void main(String[] args) {
//        Q1
//        ArrayList<String> l1 = new ArrayList<>();
//        l1.add("Larry Sherbert");
//        l1.add("Harry Katiawaala");
//        l1.add("Darcy Mehr");
//        l1.add("Rohit Watson");
//        l1.add("Gaitonde Lamar");
//        l1.add("Student 6");
//        l1.add("Student 7");
//        l1.add("Student 8");
//        l1.add("Student 9");
//        l1.add("Student 10");
//        for (Object o: l1){
//            System.out.print(o+" ");
//        }

//        Q2
//        Date d = new Date();
//        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

//        Q3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+ ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));


//        Q4
//        LocalDateTime dt = LocalDateTime.now();
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
//        System.out.println(dt.format(df));

//        Q5
//        HashSet<Integer> hs = new HashSet<>();
//        hs.add(4);
//        hs.add(5);
//        hs.add(6);
//        hs.add(9);
//        hs.add(8);
//        hs.add(7);
//        hs.add(4); //  Only one instance is stored in the set
//        System.out.println(hs);
    }
}
