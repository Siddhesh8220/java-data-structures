package com.sorting;

import java.util.Scanner;

public class BubbleSort {
    void bubbleSort(int[] arr){
        boolean swap = false;
        for (int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){  //optimised bubble sort
                System.out.println("Swap condition hit @"+ i +" th iteration");
                return;
            }
            swap = false;
        }
    }

    void  printArray(int[] arr){
        int i =0;
        while(i < arr.length){
            System.out.println(arr[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        System.out.println("Enter size of an array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of array");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
