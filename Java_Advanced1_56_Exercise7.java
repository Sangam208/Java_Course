package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class EmptyLibraryException extends Exception{
    @Override
    public String getMessage() {
        return "No Book Added In The Library As of Now!!";
    }
}

class Book{
    private String name, author;
    Book(String name, String author){
        this.name = name;
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book{" +
                "Name = '" + name + '\'' +
                ", Author = '" + author + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
class MyLibrary{
    private boolean check = false;
    ArrayList<Book> bookCollection;
    MyLibrary() {
        this.bookCollection = new ArrayList<>() ;
    }
    public boolean checkArray(){
        if (this.bookCollection.isEmpty()) {
            return true;
        }
        return false;
    }
    public void addBook(Book b){
        if (this.bookCollection.toString().contains(b.getName())) {
            System.out.println("Mentioned Book Already Exists!!");
        }else{
            this.bookCollection.add(b);
            System.out.println("Book Added Successfully!!");
        }
        System.out.println("***************************\n");
    }
    public void issueBook(String b, String user) throws EmptyLibraryException{

        for (Book currentBook: this.bookCollection){
            if(currentBook.getName().equalsIgnoreCase(b)){
                LocalDateTime d = LocalDateTime.now();
                DateTimeFormatter f = DateTimeFormatter.ofPattern("E dd/MM/yy");
                this.bookCollection.remove(currentBook);
                System.out.println("Book Issued Successfully to "+user+"!!");
                System.out.println("Issued On: "+d.format(f));
                System.out.println("***************************\n");
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("No Matches Found For Your Search!!");
        }
    }
    public void returnBook(Book b) throws EmptyLibraryException{
        if (this.bookCollection.toString().contains(b.getName())) {
            System.out.println("Mentioned Book Already Exists!!");
        }else{
            this.bookCollection.add(b);
            System.out.println("Book Returned Successfully!!");
        }
        System.out.println("***************************\n");
    }
    public void showBooks() throws EmptyLibraryException{
        for (int i = 0; i < this.bookCollection.size(); i++) {
            System.out.println(this.bookCollection.get(i));
        }
        System.out.println("***********************************\n");
    }

}

public class Java_Advanced1_56_Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyLibrary books = new MyLibrary();
        String book, writer;
        int choice;
        System.out.println("Enter Your Name");
        String username = input.nextLine();
        System.out.println("****************************************");
        System.out.println("WELCOME TO LIBRARY MANAGEMENT SYSTEM");
        System.out.println("Please Enter A Choice");
        do {
            System.out.println("1. Add Book\t\t2. Issue Book\t\t3. Return Book\t\t4. Show Book Collection\t\t5. Exit");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    input.nextLine();
                    System.out.println("Enter Name of Book");
                    book = input.nextLine();
                    System.out.println("Enter Author's Name");
                    writer = input.nextLine();
                    books.addBook(new Book(book,writer));
                    break;
                case 2:
                    try {
                        if(books.checkArray()){
                            throw new EmptyLibraryException();
                        }
                        input.nextLine();
                        System.out.println("Enter Name of Book");
                        book = input.nextLine();
                        books.issueBook(book,username);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        if (books.checkArray()) {
                            throw new EmptyLibraryException();
                        }
                        input.nextLine();
                        System.out.println("Enter Name of Book");
                        book = input.nextLine();
                        System.out.println("Enter Author's Name");
                        writer = input.nextLine();
                        books.returnBook(new Book(book,writer));
                    }catch (Exception e){
                        System.out.println("Please Issue A Book First To Return It Back!!");
                    }
                    break;
                case 4:
                    try {
                        if (books.checkArray()) {
                            throw new EmptyLibraryException();
                        }
                        books.showBooks();
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Exiting..................");
                    break;
                default:
                    System.out.println("Invalid Option!! Please Try Again!!");
            }
        }while(choice!=5);
    }
}
