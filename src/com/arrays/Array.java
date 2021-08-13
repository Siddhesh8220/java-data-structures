package com.arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        /*
        1.python has no primitives only objects
        2.arrays are continuous memory allocation in c++
        3.objects are stored in heap, arrays are object
        4.heap objects are not continuous, hence array in java may not be continuous, it depends on jvm
        5.every reference variable with no value is null by default
        Use (ctrl+click) to see implementations
        Stack vs Heap:
        https://www.youtube.com/watch?v=_8-ht2AKyH4&ab_channel=mycodeschool
        */

        int intarr[]; // array declaration, happens at compile time
        intarr = new int[5]; //array created in heap, happens at run time, (dynamic memory allocation)
        System.out.println("By default array will be zero: " + Arrays.toString(intarr)); //[0,0,0,0,0]

        String strarr[]; // array declaration, happens at compile time
        strarr = new String[5]; //array created in heap, happens at run time, (dynamic memory allocation)
        System.out.println("By default array will be null: " + Arrays.toString(strarr)); //[null,null,null,null,null]

        // new will create object in heap memory of specified size
        int[] arr = new int[5]; // arr is pointing to memory
        int[] arr2 = {1,2,3,4,5};

        int[] arr3 = {10,12,13,19,12};
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr3[i]);
        }

        // Enhanced for loop
        System.out.println("Enhanced for:");
        for(int num: arr3){
            System.out.println(num);
        }
    }
}
