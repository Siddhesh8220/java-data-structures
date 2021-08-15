package com.searching;

import java.util.Arrays;

public class MinMax2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {3,4,5,6,10},
                {7,8}
        };
        System.out.println(Arrays.toString(max_search(arr)));
    }

    static int[] max_search(int[][] arr){
        int max = Integer.MIN_VALUE;
        int r = -1 ,c = -1;
        for(int row=0;row<arr.length;row++){
            for(int column=0;column<arr[row].length;column++){
                if(max < arr[row][column]){
                    max = arr[row][column];
                    r = row;
                    c = column;
                }
            }
        }
        return new int[]{r,c,max};
    }
}
