package com.searching.BinarySearchProblems;

//Leetcode - 34. Find First and Last Position of Element in Sorted Array

//[1,2,3,3,3,4,5]

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 7;
        int firstIndex = findFirstIndex(arr, target);
        int lastIndex = findLastIndex(arr, target);
        System.out.println(Arrays.toString(new int[]{firstIndex,lastIndex}));
    }

    static int findFirstIndex(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while(start <= end){
            int mid = start + (end-start) / 2;
            if(arr[mid] == target){
                index = mid;
            }
            if(target <= arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return index;
    }

    static int findLastIndex(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while(start <= end){
            int mid = start + (end-start) / 2;
            if(arr[mid] == target){
                index = mid;
            }
            if(target >= arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return index;
    }
}
