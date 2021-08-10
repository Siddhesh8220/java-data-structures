package com.siddhesh;

import java.util.Scanner;

public class ReverseString {
    //Hello
    static String reverse_string(String str){
        if(str.length()==1){
            return ""+str.charAt(0);
        }
        return reverse_string(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String reversedString = reverse_string(str);
        System.out.println(reversedString);
    }
}
