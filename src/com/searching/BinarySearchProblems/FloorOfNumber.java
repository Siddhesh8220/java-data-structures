package com.searching.BinarySearchProblems;

//find smallest no in array >= target element

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,8,9};
        int target = 3;
        int index = binarySearch(arr, target);
        System.out.println("Number of Floor found @: "+ index);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}

