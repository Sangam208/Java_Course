/*
    tags ---> @author, @version,@param, ...
    method tags ---> @param, @return, @throws...

*/

package com.company;
/**
 * This class is designed to demonstrate the building of JavaDocs and how it can be used in the world of Java
 * @author Sangam
 * @version 1.0.1
 * @since 2001
 * @see <a href="https://docs.oracle.com/en/java/javase/21/docs/api/index.html" target="_blank">Java 21 Docs</a>
 */

public class Java_Advanced2_57_JavaDocs {
    /**
     * This is a default constructor which is created automatically by Java if no other constructor is explicitly created.
     * <p>It constructs a new instance for {@code Java_Advanced2_57_JavaDocs} class</p>
     */
    public Java_Advanced2_57_JavaDocs(){}

    /**
     *
     * This is a method to add two numbers. It takes two arguments.
     * @param a This is the first number to add
     * @param b This is the second number to add
     * @return Returning sum of two numbers as integer
     * @throws Exception if a = 1
     * @deprecated This method is deprecated. You can use '+' operator instead.
     */
    public int add(int a, int b) throws Exception{
        if (a == 1) {
            throw new Exception();
        }
        return a+b;
    }

    /**
     *This is the main method of the class which is the starting point for every program
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("This is main function");
    }
}
