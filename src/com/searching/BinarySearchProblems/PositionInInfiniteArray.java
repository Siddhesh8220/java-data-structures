package com.searching.BinarySearchProblems;

/*
    Problem : Given an infinite sorted array find position of element with log n complexity.
    1.Assume array to be infinite that is arr.length = infinity, so we can't use length
    2.we have to implement using log n complexity
    3.we are increasing the box size by multiplying by 2 so that we can achieve log n complexity (reverse binary search (bottom up approach))
    4.we need to find start and end index to apply binary search in infinite array.
    5.It will giver error for finite array as index out of bound as we are suppose to use infinite array
 */


public class PositionInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {12,13,14,15,16,17,18,19,20};
        int target = 15;
        int position = findPosition(arr, target);
        System.out.println(position);
    }

    static int findPosition(int[] arr, int target){
        int start = 0;
        int end = 0;
        while (target  > arr[end]){
            int temp = end +1 ;
            end = end + (end-start+1)*2;
            start = temp;
        }
        System.out.println(end);
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) /  2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
