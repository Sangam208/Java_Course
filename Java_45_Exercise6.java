/* Create a Custom Calculator with following operations:
    - Addition
    - Subtraction
    - Multiplication
    - Division
    which throws the following exceptions:
    1. Invalid input Exception (example: 8 & 9)
    2. Can not divide by 0
    3. Max Input Exception if any of the inputs is greater than 100000
    4. Max Multiplier Reached Exception - Do not allow any multiplication input to be greater than 7000
*/

package com.company;
import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Invalid Input (Custom Setting for 8 and 9 Un-functionality)";
    }
}

class IndivisibleByZeroException extends Exception{
    @Override
    public String toString() {
        return "No Number Can Be Divided By Zero";
    }
}

class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Input must be not be greater than 100000";
    }
}

class MaxMultiplierException extends Exception{
    @Override
    public String toString() {
        return "Input for multiplication must not exceed 7000";
    }
}

class Calculator{
    private double num1, num2;
    private int choice;
    Calculator(double a, double b, int c){
        num1 = a;
        num2 = b;
        choice = c;
    }
    public void Operation() throws IndivisibleByZeroException, MaxInputException, MaxMultiplierException, InvalidInputException{
        if(num1>100000 || num2>100000){
            throw new MaxInputException();
        }else if(num1 == 8 || num2 == 9 || num1 == 9 || num2 == 8){
            throw new InvalidInputException();
        }
        switch(choice){
            case 1 : System.out.println(num1+" + "+num2+" = "+num1+num2); break;
            case 2 : System.out.println(num1+" - "+num2+" = "+(num1-num2)); break;
            case 3 :
                if(num1>7000 ||num2>7000){
                    throw new MaxMultiplierException();
                }
                System.out.println(num1+" * "+num2+" = "+num1*num2);break;
            case 4:
                if(num2==0){
                    throw new IndivisibleByZeroException();
                }
                System.out.println(num1+"/"+num2+" = "+num1/num2);
                break;
            default: break;
        }

    }

}

public class Java_45_Exercise6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double n1,n2;
        int option;
        System.out.println("1. Add(+)\t\t2. Subtract(-)\t\t3. Multiply(*)\t\t4. Divide(/)");
        System.out.println("Enter two numbers");
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        System.out.print("Enter your choice: ");
        option = input.nextInt();
        Calculator calc1 = new Calculator(n1,n2,option);
        try{
            calc1.Operation();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
