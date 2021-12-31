package com.siddhesh;

import java.util.*;
import java.lang.*;
import java.io.*;

public class EvenOccurenceArray {

    public static void main (String[] args) throws java.lang.Exception
    {
        int[] arr={10,10,10,20,20,30,2,30,30,2,2,6,2};
        evenOccurence(arr);
    }

    public static void evenOccurence(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else{
                int c = map.get(arr[i])+1;
                map.replace(arr[i], c);
            }
        }
        map.forEach((k,v) -> {if(v%2==0){System.out.println("Key = " + k + ", Value = " + v);}});
    }
}
