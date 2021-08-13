package com.arrays;

public class NoFixColSize {
    public static void main(String[] args) {
        int arr2[][] = new int[3][4];

        int[][] arr2D = {
                {1,2,3},
                {4,5},
                {7,8,9,10}
        };
        for(int i=0;i<arr2D.length;i++){ //every element of array is itself an array
            for(int j=0;j<arr2D[i].length;j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println(); //print new line
        }
    }
}
