package com.company;
import java.io.*;
import java.util.Scanner;

//Q1 ---> Generating JavaDoc of this file
/**
 * This class is created to generate JavaDocs by using Intellij Idea through the assistance of Java Development Kit (JDK) that is installed on the computer system
 * <p>JavaDocs can also be generated without using Intellij Idea IDE by writing command in the terminal manually</p>
 * @version 1.0.2
 * @since 2001
 * @see <a href="https://docs.oracle.com/en/java/javase/21/docs/api/index.html" style="color:green;"  target="_blank">Java 21 Docs</a>
 */

// Q2
/**
 *This class is created to demonstrate the use of a deprecated method
 */
class Deprecate{
    /**
     * This is default constructor for class Deprecate. It is created and called automatically by Java if no constructor is defined explicitly
     */
    Deprecate(){}
    /**
     * This method returns a square of any integer value
     * @param a This is the number to be squared
     * @return Returns square of the number
//     * @deprecated This method is deprecated. Instead, use Math.pow() method or simply multiply the number by itself
     */
    @Deprecated
//    Q3
    public int square(int a){
        return a*a;
    }
}

// Q4

/**
 * This is an interface created to generate an instance without having to implement it to a class
 */
interface Instance{
    /**
     * This is display method declaration
     */
    void display();
}

public class Java_Advanced2_62_PracticeSet10 {
    /**
     * This is a default constructor which is created automatically by Java if no other constructor is explicitly created.
     * <p>It constructs a new instance for {@code Java_Advanced2_62_PracticeSet10} class</p>
     */
    Java_Advanced2_62_PracticeSet10(){}

    /**
     * This method multiplies any two float values and returns product
     * @param x This is the first number to multiply
     * @param y This is the second number to multiply
     * @return Returns a float value product
     * @deprecated This method is deprecated. Use binary multiply '*' operator instead
     */
    public static float product(float x, float y){
        return x*y;
    }

    /**
     * This is the main function which is the starting point for any program
     * @param args These are arguments supplied to the command line
     */
//    Q3
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        System.out.println(product(4.3f,2.64f));
        Deprecate d = new Deprecate();
        System.out.println(d.square(5));
//        Instance i = new Instance() {@Override public void display() {System.out.println("This is function call!!");}};
        Instance i = ()-> System.out.println("This is function call");
        i.display();

//        Creating a file
//        File file = new File("Practice.txt");
//        try{
//            file.createNewFile();
//            System.out.println("File Created Successfully");
//        }catch (Exception e){
//            System.out.println("Unable To Create File\n"+e);
//        }

//        Writing in the file
        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();
        try {
            FileWriter fileWriter = new FileWriter("Practice.txt");
                fileWriter.write("Multiplication Table of " + n);
                for (int j = 1; j <= 10; j++) {
                    fileWriter.write("\n"+n + " * " + j + " = " + n * j);
                }
                fileWriter.close();

        }catch (Exception e){
            System.out.println("Unable To Write In File\n"+e);
        }
    }
}