package com.company;
import java.util.Scanner;

public class Java_11_PracticeSet4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        Question 2
//        Checking whether number is present in array or not
//        byte []array = new byte[5];
//        System.out.println("Enter the elements of array:");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = input.nextByte();
//        }
//        System.out.print("Enter the number to be checked: ");
//        byte checkNum = input.nextByte();
//        boolean test = false;
//        for (int element: array){
//            if (element == checkNum) {
//                System.out.println("PRESENT!!");
//                test = true;
//                break;
//            }
//        }
//        if (!test) {
//            System.out.println("NOT PRESENT!!");
//        }


//        Question 3
//        float []marks = {89.5f, 77.5f, 90, 45.5f, 23};
//        float sum = 0;
//        for (float element: marks){
//            sum += element;
//        }
//        System.out.println(sum);
//        System.out.println("Average Marks in Physics:\t"+sum/(float)marks.length);

//        Question 4
//        Adding two matrices

//        int [][]array1 = new int[2][3];
//        System.out.println("Enter elements of first matrix:");
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                array1[i][j] = input.nextInt();
//            }
//        }
//
//        int [][]array2 = new int[2][3];
//        System.out.println("Enter elements of second matrix:");
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                array2[i][j] = input.nextInt();
//            }
//        }
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(array1[i][j] + array2[i][j]+"\t");
//            }
//            System.out.print("\n");
//        }

//        Question 5
//        Reversing an array
        int []array = {1,2,3,4,5};
        int temp;
//        int a = Math.floorDiv(array.length,2); --> array.length/2
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        for (int element: array){
            System.out.println(element);
        }

//        Question 6, 7 and 8
//        Finding maximum and minimum numbers in an array
//        int []maxArray = new int[5];
//        int max = 0;
//        System.out.println("Enter the elements:");
//        for (int i = 0; i < 5; i++) {
//            maxArray[i] = input.nextInt();
//        }

//        Checking whether the entered array is sorted or not
//        boolean sort = true;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (maxArray[i] > maxArray[j]) {
//                    sort = false;
//                }
//            }
//        }
//        if(sort){
//            System.out.println("Sorted!!");
//        }else{
//            System.out.println("Unsorted!!");
//        }
//
//        for(int e: maxArray){
//            if(e>max){
//                max = e;
//            }
//        }
//        System.out.println("Maximum element: "+max);
//
//        for(int e: maxArray){
//            if(e<max){
//                max = e;
//            }
//        }
//        System.out.println("Minimum element: "+max);


//        32 12 34 23 10

    }
}
