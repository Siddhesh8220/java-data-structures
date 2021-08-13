package com.arrays;

import java.util.ArrayList;

/*
Working:
1. Suppose if initial capacity is 3 and if we enter 4 th element (it will create new arryalist at any point like if arraylist is half filled)
2. then new arraylist will be created with bigger size and all elements from previous list are added in new list
3. old list is removed
* */

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(3); //Generic List , initial capacity is optional
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.set(0,99); // 0 th index to 99
        list.remove(2); //remove element
        System.out.println(list.contains(20));
        System.out.println(list);

//      System.out.println(list[2]); // It will give error as it don't work with arraylist
        System.out.println(list.get(2));
    }
}
