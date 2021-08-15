package com.searching;

/*
Time Complexity : Worst case - O(N) , Best Case - O(1)
 */

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        if(linear_search(arr, 20)){
            System.out.println("Value found");
        }
        else {
            System.out.println("Value not found");
        }

        System.out.println(linear_search2(arr, 35));

    }
    static boolean linear_search(int[] arr,int target){
        if(arr.length == 0){
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    static int linear_search2(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

}
