package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[][] = new int[3][]; //no need to mention column size

        int array[][] = new int[3][3];
        for(int i=0; i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j] = sc.nextInt();
            }
        }
        for(int[] a: array){ //every element of array is itself an array
            System.out.println(Arrays.toString(a));
        }

    }
}
