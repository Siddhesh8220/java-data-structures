package com.siddhesh;

import java.util.Scanner;

public class Palindrome {
    static boolean is_palindrome(int num){
        int number= num;
        int pal=0;
        while(number>0) {
            int temp = number % 10;
            number = number / 10;
            pal = pal * 10 + temp;
        }
        if(num == pal){
            return true;
        }
        return false;
    }

    static boolean is_Armstrong(int num){
        int original = num;
        int sum=0;
        int rem = 0;
        while (num>0){
            rem = num % 10;
            sum += rem *rem *rem;
            num = num/10;
        }
        return original == sum; // new way to learn
    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (is_palindrome(num)){
            System.out.println("Number is palindrome");
            return;
        }
        if (is_Armstrong(num)){
            System.out.println("Number is armstrong number");
            return;
        }
        System.out.println("Number is not palindrome nor armstrong");
    }
}
