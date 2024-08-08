
// Checking whether student is pass or fail such that it requires:
// at least 40% of total marks and 33% of marks in each subjects(3)
// Assuming each subject of full marks 100 and overall total marks 300
package com.company;
import java.util.Scanner;

public class Java_07_PracticeSet2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean result = false;
        float []marks = new float[3];
        float totalMarks = 0f;
        System.out.println("Enter marks in Physics, Chemistry and Mathematics:");

        for (int i = 0; i < 3; i++) {
            marks[i] = input.nextFloat();
            totalMarks += marks[i];

        }

        System.out.println("Marks:");
        for (int i = 0; i < 3; i++) {
            System.out.print(marks[i]+"\t");
        }

        if (totalMarks >= 120) {
            for (int i = 0; i < 3; i++) {
                if (marks[i] >=33) {
                    result = true;
                }else{
                    System.out.println("\nTotal Marks = "+totalMarks+"/300\n FAIL!!");
                    break;
                }
            }
            if(result){
                System.out.println("\nTotal Marks = "+totalMarks+"/300\nPASS!!");
            }
        }else{
            System.out.println("\nTotal Marks = "+totalMarks+"/300\nFAIL!!");
        }

    }
}
