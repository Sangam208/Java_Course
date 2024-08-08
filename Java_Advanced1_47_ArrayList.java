// ArrayList is modified array
package com.company;
import java.util.*;

public class Java_Advanced1_47_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
//        add() method pushes elements into the arraylist
        l2.add(13);
        l2.add(43);
        l2.add(25);

        l1.add(4);
        l1.add(6);
        l1.add(6);
        l1.add(8);
        l1.add(9);
        l1.add(1,20);

//      addAll() method adds another collection/arraylist in other collection
//        l1.addAll(l2); // without index
        l1.addAll(2,l2); // with index
        System.out.println(l1.contains(27));
        for (int i = 0; i <l1.size(); i++) {
            System.out.print(l1.get(i)+" ");
        }
//        l1.clear(); // clears arraylist
        System.out.println("\n"+l1.indexOf(6));
//        System.out.println(l1.indexOf(46));
        System.out.println(l1.lastIndexOf(6));

        l1.set(3,55);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i)+" ");
        }
        System.out.println("\nFirst element: "+l1.getFirst());
        System.out.println("Last element: "+l1.getLast());
        System.out.println(l1.isEmpty());
    }
}
