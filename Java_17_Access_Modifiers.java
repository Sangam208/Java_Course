package com.company;

class MyStudents{
    private int roll;
    private String name;
    private float total_marks;

    void setData(String n, int r, float m){
        name = n;
        roll = r;
        total_marks = m;
    }
    void getData(){
        System.out.println("Name: "+name+"\t\tRoll No: "+roll+"\t\tMarks Obtained: "+total_marks);
    }
}

public class Java_17_Access_Modifiers {
    public static void main(String[] args) {
        MyStudents s1 = new MyStudents();
//        s1.roll = 1; --> throws error since data is private
        s1.setData("Larry Sherbet", 12, 123.5f);
        s1.getData();
    }
}
