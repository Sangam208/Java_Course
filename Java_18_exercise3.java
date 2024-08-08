/* 'Guess the number' game
 Create class Game which has the following methods:
    1. Constructor to generate random number
    2. takeUserInput() to take a number from user
    3. isCorrectNumber() to detect whether number entered by user is true or not
    4. getter and setter for noOfGuesses
    Use properties such as noOfGuesses(int), etc to get it done
*/

package com.company;
import java.util.Scanner;
import java.util.Random;

class Game{
    Scanner userInput = new Scanner(System.in);
    private int randomNumber;
    private int userGuessNum;
    private static int noOfGuesses = 0;

    Game(){}
    Game(int n){
        randomNumber = n;
    }

    void takeUserInput(){
        userGuessNum = userInput.nextInt();
    }

    static void setNoOfGuesses(int guess){
        noOfGuesses = guess;
    }

    void countGuess(){
        noOfGuesses++;
    }

    int getNoOfGuess(){
        return noOfGuesses;
    }

    void isCorrect(){
        do {
            if (userGuessNum > randomNumber) {
                System.out.println("GO LOW!!");
                takeUserInput();
                countGuess();
            }else if (userGuessNum < randomNumber) {
                System.out.println("GO HIGH!!");
                takeUserInput();
                countGuess();
            }
        }while(userGuessNum != randomNumber);
        if(userGuessNum == randomNumber){
            countGuess();
            System.out.println("BINGO!! YOU WON!!\nTHE NUMBER WAS "+randomNumber);
        }
    }
}

public class Java_18_exercise3 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        String choice;

        do {
//            Generating random number and taking user input number
            int randNum = rand.nextInt(1,50);
            Game playGame = new Game(randNum);
            System.out.println("GUESS THE NUMBER!!");
            playGame.takeUserInput();

//            Checking the user input number
            playGame.isCorrect();
            System.out.println("Total Guesses:\t"+playGame.getNoOfGuess());
            Game.setNoOfGuesses(0);

            System.out.println("DO YOU WISH TO PLAY AGAIN?");
            choice = input.next();
        }while(choice.equals("y"));

    }
}
