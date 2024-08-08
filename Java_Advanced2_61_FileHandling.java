package com.company;

import java.io.FileWriter;

public class Java_Advanced2_61_FileHandling {
    public static void main(String[] args) {
//        Creating a File
/*
        File file = new File("SampleFile.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable To Create File");
            e.printStackTrace();
        }
*/

//        Writing in a File


//        int a = 1;
//        try {
//            FileWriter fileWriter = new FileWriter("SampleFile.txt");
//            fileWriter.write(a+". This is our first file in Java File Handling ");
//            fileWriter.close();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }


//        Reading from a File
/*
        File file = new File("SampleFile.txt");
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()){
                String str = input.nextLine();
                System.out.println(str);
            }
            input.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
 */

//        Deleting a File
//        File file = new File("SampleFile.txt");
//        if (file.delete()){
//            System.out.println("File "+file.getName()+" has been deleted");
//        }else{
//            System.out.println("Unable To Delete The File");
//        }
    }
}
