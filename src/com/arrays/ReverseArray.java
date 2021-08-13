package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    static void swap(int[] arr,int start,int end){
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
