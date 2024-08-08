// Checked Exception ----> thread.sleep() ---> Compile time
// Unchecked Exception ----> 1/0 ---> Runtime

package com.company;

public class Java_38_Try_Catch {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
//        Solving Runtime error using try and catch block
        try{
            System.out.println("Result is "+10/n);
        }catch (Exception e){
            System.out.println("Error Occured ----->"+e);
        }
    }
}
