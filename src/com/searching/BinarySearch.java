package com.searching;

/*

1. Works for Sorted Array
2. Time Complexity: Best Case - O(1), Worst Case - O(log n)
3. Suppose we want to search array with 1 million elements then linear search will make 1 million comparisons
   while binary search will make log(1000000) = 20 comparisons
4. Agnostic Binary search works on both ascending on descending array

Approach:
1. find middle element
2. if target > middle element recursively call for array mid+1 to end
3. else recursively call for array start to mid-1
4. base condition would be if middle element is target then return it.
5. if element does not exist then second based condition will be (start > end) return -1

 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //int[] arr = {5,4,3,2,1};
        boolean isAsc = arr[0] < arr[arr.length-1];
        int index = orderAgnosticBinarySearch(arr,0, arr.length-1, 2, isAsc);
        System.out.println("Element found @ index: "+ index);
    }

    static int orderAgnosticBinarySearch(int[] arr, int start, int end, int target, boolean isAsc){
        int mid = start + (end - start) / 2;
        if(start > end ){
            return -1;
        }
        if (arr[mid] == target){
            return mid;
        }

        if(arr[start] < arr[end]? target > arr[mid]: target < arr[mid]){ //Agnostic Binary Search finds out if array in desc and ascending order
            return orderAgnosticBinarySearch(arr, mid+1, end, target , isAsc);
        }
        return orderAgnosticBinarySearch(arr, start, mid-1, target, isAsc);


/*
        OR (with help of isAsc)
        if(isAsc){
            if(target > arr[mid]){
                return binarySearch(arr, mid+1, end, target , isAsc);
            }
            return binarySearch(arr, start, mid-1, target, isAsc);
        }
        else if(target < arr[mid]){
            return binarySearch(arr, mid+1, end, target , isAsc);
        }
        return binarySearch(arr, start, mid-1, target, isAsc);

 */
    }

    /* Second Way
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
     */

}
