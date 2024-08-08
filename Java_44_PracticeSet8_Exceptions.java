package com.company;

import javax.naming.directory.InvalidAttributeValueException;
import javax.naming.directory.InvalidAttributesException;

//Q4
class MaxRetrieveException extends Exception{
    @Override
    public String toString() {
        return "Maximum Retrievel Reached!!";
    }

    @Override
    public String getMessage() {
        return "Maximum Retrievel Reached!!";
    }
}
public class Java_44_PracticeSet8_Exceptions {
//    Q2
//    public static void function(int a){
//        int b = 15;
//        try{
//            System.out.println(b/a);
//        }catch (ArithmeticException e){
//            System.out.println("Haha");
//        }catch (IllegalArgumentException e){
//            System.out.println("Hehe");
//        }
//    }

    public static void display() throws MaxRetrieveException{
//        Q3
        int []marks = {32,12,46};
        java.util.Scanner s = new java.util.Scanner(System.in);
        int count = 0;
        boolean flag = true;
        while(flag){
            System.out.println("Enter index:");
            int indx = s.nextInt();
            count++;
            if(count == 5){
//                System.out.println("Error");
//                break;
                try {
                    throw new MaxRetrieveException();
                }catch (Exception e){
                    System.out.println("Error");
                    break;
                }
            }

//            try{
//                System.out.println("Value at index "+indx+" is "+marks[indx]);
//                flag = false;
//            }catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("Array-Index "+indx+" does not exist");
//            }
        }
    }
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
//        System.out.println("Enter value for argument: ");
//        int a = s.nextInt();
//        function(a);
        try {
            display();
        }catch (Exception e){
            System.out.println("Exception!!");
        }


    }
}
