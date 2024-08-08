package com.company;

public class Java_40_Nested_Try_Catch {
    public static void main(String[] args) {
        int []marks = new int[3];
        marks[0] = 43;
        marks[1] = 26;
        marks[2] = 65;
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("Enter any array index: ");
        int indx = s.nextInt();
        System.out.print("Enter number to divide the array-value with: ");
        int num = s.nextInt();

        try {
            try {
                System.out.println("Value at index "+indx+" is "+marks[indx]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("This index does not exist!!\nException in Level 2");
            }
        }catch (Exception e){
            System.out.println("Exception in Level 1");
        }
    }
}
