package com.siddhesh;

import java.util.Scanner;

public class Fibonacci {
//    public static void main(String[] args) {
//        System.out.println("Enter a number");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        int count=2;
//
//        while(count<=n){
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);
//    }
public static void main(String[] args) {
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    int c=a+b;
    int count = 2 ;

    while(count<=n){
//        if(c==n) {
//            System.out.println("fib");
//            break;
//        }
        c =  a+ b;
        a = b;
        b= c;
        count++;
    }
    System.out.println(b);
}
}
