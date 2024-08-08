
//Generating random number between given limits

package com.company;
import java.util.Random;
import java.util.Scanner;

public class Java_08_RandomNumber {
    public static void main(String[] args) {

        Random randomInput = new Random();
        Scanner input = new Scanner(System.in);
        String choice;
        do{
            int num = randomInput.nextInt(1,10);
            System.out.println(num);
            choice = input.next();
        }while(choice.equals("y"));
    }
}
