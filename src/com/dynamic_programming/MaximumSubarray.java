package com.dynamic_programming;

import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int result = maxSubArray(new int[]{5,4,-1,7,8});
        System.out.println("result maximum subarray:" + result);
    }
    public static int maxSubArray(int[] A) {
            int n = A.length; // Size of the array
            int local_max = 0;
            int global_max = -1; // Infinity
            for (int i=0; i<n; i++)
            {
                local_max = Math.max(A[i], A[i] + local_max);
                if (local_max > global_max)
                {
                    global_max = local_max;
                }
            }
            return global_max;
        }
    }
