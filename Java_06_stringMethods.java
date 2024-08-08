package com.company;
import java.util.Scanner;

public class Java_06_stringMethods {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name: ");

//        String str = "     This is me and I'm best     ";
//        String s = str.trim();
//        String s = "Shabbiness";
//        System.out.println(s.substring(4,12));
//        System.out.println(s.startsWith("Th")); ---> false

        String gratitude = "Dear name, thanks a lot!!";
        String name = input.nextLine();
        System.out.println(gratitude.replace("name", name));
//        System.out.println(name.replaceAll("a","s"));
//        System.out.println(name.indexOf("nga"));
        System.out.println(name.lastIndexOf('a'));

        System.out.println("Enter another name: ");
        String anotherName = input.nextLine();

        System.out.println(name.equals(anotherName)); // case sensitive
        System.out.println(name.equalsIgnoreCase(anotherName)); // ignores case sensitivity

//        System.out.println("String = \"Dear "+name+", Thanks!!\"");
    }
}


/*
sth.length()
sth.substring(a)
sth.substring(a,b)
sth.trim()
sth.startsWith()
sth.endWith()
sth.next()
sth.nextLIne()
sth.replace('a','b')
sth.replaceAll("a","s")
sth.indexOf()
 */
