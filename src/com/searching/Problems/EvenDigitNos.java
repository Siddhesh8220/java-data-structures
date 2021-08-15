package com.searching.Problems;


// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/

public class EvenDigitNos {
    public static void main(String[] args) {
        int[] arr ={10,2,333,444,5555,678};
        findNumbers(arr);
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(digit_count(nums[i]) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    static int digit_count(int num){
        if(num < 0){
            num *= -1;
        }
        return (int)(Math.log10(num))+1;    // returning no of digit without using for loop with / operator and faster
    }
}
