package com.arrays;

import java.util.Arrays;
import java.util.Scanner;


//Strings are immutable and arrays are mutable
public class StrArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str[] = new String[4];
        for (int i=0;i<str.length;i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        str[1] = "changed";
        System.out.println(Arrays.toString(str));
    }
}
