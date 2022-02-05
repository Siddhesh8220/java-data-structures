package com.dynamic_programming;

import java.util.*;

//Longest common subsequence
public class LCS {
    public static void main(String[] args) {
        int result = longest_subsequence(new int[]{1,2,4,3});
        System.out.println("result:" + result);
    }
    public static int longest_subsequence(int[] arr){
        int[] LIS = new int[arr.length];
        Arrays.fill(LIS, 1);
        for(int i = arr.length - 1; i>=0 ; i--){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    LIS[i] =  Math.max(1+LIS[j],LIS[i]);
                }
            }
        }
        return Arrays.stream(LIS).max().getAsInt();
    }
}
