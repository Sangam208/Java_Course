// Java Generics is similar to templates in C++ (Not same though)
package com.company;

class Generics<T1, T2>{
    private int value;
    private T1 t1;
    private T2 t2;

    public Generics(int value, T1 t1, T2 t2) {
        this.value = value;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t) {
        this.t1 = t;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}


public class Java_Advanced2_60_JavaGenerics {
    public static void main(String[] args) {

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add("String");
//        arrayList.add(43);
//        arrayList.add(23);
////        arrayList.add(23.5);
//        int a = arrayList.get(1);

        Generics<Float,Integer> g1 = new Generics(12,32.5, 54);

//       Following throws error since float and int are primitive data types
//       Generics<float,int> g1 = new Generics(12,32.5, 54);
        System.out.println(g1.getT1());
        System.out.println(g1.getT2());
    }
}
