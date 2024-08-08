package com.company;

class NegativeDimException extends Exception{
    @Override
    public String toString() {
        return "Dimensions can not be negative!!";
    }

    @Override
    public String getMessage() {
        return "Dimensions can not be negative!!";
    }
}

public class Java_42_Throw_Throws {

    public static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static double volumeCylinder(float r, float h) throws NegativeDimException{
        if (r<0 || h<0) {
            throw new NegativeDimException();
        }
        return Math.PI*r*r*h;
    }

    public static void main(String[] args) {
        try {
//            System.out.println(divide(3,0));
            System.out.println(volumeCylinder(-3.4f, 5.4f));
        }catch (Exception e){
            System.out.println("Exception Occured!!");
        }
    }
}

// throws ---> indication that an exception could occur
// throw ---> used to throw exception
