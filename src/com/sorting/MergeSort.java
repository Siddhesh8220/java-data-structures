package com.sorting;

import java.util.Scanner;

public class MergeSort {
    void merge(int[] arr,int begin,int mid,int end){
        int n1 = mid - begin + 1;
        int n2 = end - mid;
        int[] a = new int[n1];
        int[] b = new int[n2];

        for(int i=0; i<n1; i++){
            a[i] = arr[begin + i];
        }
        for(int i=0; i<n2; i++){
            b[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = begin;

        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                arr[k] = a[i];
                k++; i++;
            }
            else{
                arr[k] = b[j];
                k++; j++;
            }
        }

        while(i < n1){
            arr[k] = a[i];
            k++;i++;
        }

        while(j < n2){
            arr[k] = b[j];
            k++;j++;
        }

    }
    void mergeSort(int[] arr, int begin, int end){
        if(begin < end){
            int mid = (begin + end) / 2;
            mergeSort(arr, begin, mid);
            mergeSort(arr,mid+1,end);
            merge(arr,begin,mid,end);
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
        MergeSort ob = new MergeSort();
        System.out.println("Enter size of an array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of array");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        ob.mergeSort(arr,0,arr.length-1);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}

//n log n
