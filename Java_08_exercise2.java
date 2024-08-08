
//Building a simple game of rock, paper and scissors

package com.company;
import java.util.Scanner;
import java.util.Random;

public class Java_08_exercise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        char []game = {'r','p','s'};
        String play;

        do {
//            Generating choice by computer
            int pickNumber = rand.nextInt(3);
            System.out.println("\n\t\tThe Computer is ready");

//            Taking user's choice
            System.out.print("\t********************************\n\t\tEnter your choice: ");
            String choice = input.next();
            System.out.println("\t******************************** ");

            switch (choice){
                case "r":
                    if(pickNumber == 0){
                        System.out.println("\t\tDRAW!!");
                    } else if(pickNumber ==1) {
                        System.out.println("\t\tYOU LOST!!");
                    }else{
                        System.out.println("\t\tYOU WON!!");
                    }
                    break;

                case "p":
                    if(pickNumber == 1){
                        System.out.println("\t\tDRAW!!");
                    } else if(pickNumber ==2) {
                        System.out.println("\t\tYOU LOST!!");
                    }else{
                        System.out.println("\t\tYOU WON!!");
                    }
                    break;

                case "s":
                    if(pickNumber == 2){
                        System.out.println("\t\tDRAW!!");
                    } else if(pickNumber ==1) {
                        System.out.println("\t\tYOU LOST!!");
                    }else{
                        System.out.println("\t\tYOU WON!!");
                    }
                    break;

                default:
                    System.out.println("\t\tINVALID CHOICE!!");
                    break;
            }

            System.out.println("\t\tPlay Again?");
            play = input.next();

        }while(play.equals("y"));

    }
}
