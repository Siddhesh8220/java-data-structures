package com.special_patterns.slidingWindow;

// https://hackernoon.com/14-patterns-to-ace-any-coding-interview-question-c5bb3357f6ed

public class SlidingWindow {
    public static int maxConsecutiveSubsetSum(int[] arr,int length){
        if(arr.length < length){
            return -1;
        }
        int maxSum = 0;
        for(int i = 0; i < length; i++){
            maxSum += arr[i];
        }
        int p1 = 0;
        int p2 = length;
        int tempSum = maxSum;

        while (p2 < arr.length) {
            // Calculate prospective sum using window edges so that sum includes p2 and excludes p1 values.
            // tempSum =  16  -    4     +    9
            tempSum = tempSum - arr[p1] + arr[p2];
            // Update condition
            if (tempSum > maxSum)
                maxSum = tempSum;
            // Slide the window along the list
            p1++;
            p2++;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int result = maxConsecutiveSubsetSum(arr, 3);
        System.out.println("Maximum Consecutive Subset Sum: "+result);
    }
}
