package com.special_patterns.slidingWindow;
// https://www.youtube.com/watch?v=jSvoE-_Yhs4
// anchor is starting point of subsequence while i is ending point
public class LongestCommonIncreasingSubsequence {
    public static int findLengthofLCIS(int[] nums){
        int result = 0;
        int anchor = 0;

        for(int i =0; i<nums.length; i++){
            if(i > 0 && nums[i-1] >= nums[i]) anchor = i;
            result = Math.max(result, i - anchor + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,4,5};
        int result = findLengthofLCIS(arr);
        System.out.println("Longest Common Increasing Subsequence: "+ result);
    }
}
