/*
Implementing class Library
Methods: addBook, issueBook, returnBook, showAvailableBooks
Properties: Array to store the available books,
Array to store the issued books
*/

package com.company;
import java.util.Scanner;

class Library{
    private String []books;
    private int no_books;

    Library(){
        this.books = new String[100];
        no_books = 0;
    }
    void addBook(String opus){
        books[no_books] = opus;
        System.out.println("*****************\n\""+this.books[no_books]+"\" has been added");
        System.out.println("***********************");
        no_books++;
    }
    void issueBook(String opus){
        boolean checkBook = false;
        for (int i = 0; i < this.books.length; i++) {
            if (opus.equalsIgnoreCase(this.books[i])) {
                System.out.println("\""+this.books[i]+"\" has been issued!!");
                System.out.println("**************************");
                this.books[i] = null;
                checkBook = true;
                break;
            }
        }
        if (!checkBook) {
            System.out.println("Sorry!! No Matches Found For Your Search!!");
            System.out.println("*******************************");
        }
    }
    void returnBook(String opus){
        addBook(opus);
    }
    void showAvailableBook(){
        for (String opus: this.books){
            if (opus == null) {
                continue;
            }
            System.out.println("^ "+opus);
        }
        System.out.println("************************");
    }
}

public class Java_22_exercise4 {
    public static void main(String[] args) {
        Library cambridge = new Library();
        int serviceOptions;
        String bookName;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Cambridge Library!!");

        do {
            System.out.println("1. Add Book\t\t2. Issue Book\t\t3. Return Book\t\t4. Show Books\t\t5.Exit");
            System.out.println("Choose a service");
            serviceOptions = input.nextInt();
            switch (serviceOptions){
                case 1:
                    System.out.println("Enter the book you want to add");
                    input.nextLine();
                    bookName = input.nextLine();
                    cambridge.addBook(bookName);
                    break;

                case 2:
                    System.out.println("Enter the book you want to issue");
                    input.nextLine();
                    bookName = input.nextLine();
                    cambridge.issueBook(bookName);
                    break;

                case 3:
                    System.out.println("Enter the book you want to return");
                    input.nextLine();
                    bookName = input.nextLine();
                    cambridge.returnBook(bookName);
                    break;

                case 4:
                    System.out.println("Available books:");
                    cambridge.showAvailableBook();
                    break;
            }
            System.out.println("Restarting........");
        }while(serviceOptions !=5);
    }
}
