package com.patterns;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int input = sc.nextInt();
        int c = input;
        while(input > 0){ //condition      // similar to inverted triangle just replaced spaces with stars and vice versa
            //print star
            int space = (c - input)/2;
            for(int i = space; i>0;i--){
                System.out.print("*");
            }
            //print space
            for(int i = input; i>0;i--){
                System.out.print(" ");
            }
            //print star
            for(int i = space; i>0;i--){
                System.out.print("*");
            }
            System.out.println();
            input  = input - 2;
        }

        int temp = 1;
        if(c%2==0){ // if the numbers are even then temp will be 2 to print 2 spaces
            temp = 2;
        }
        while(temp <= c){  //// similar to triangle just replaced spaces with stars and vice versa
            //print star
            int space = (c - temp)/2;
            for(int i = space; i>0;i--){
                System.out.print("*");
            }
            //print space
            for(int i = temp; i>0;i--){
                System.out.print(" ");
            }
            //print star
            for(int i = space; i>0;i--){
                System.out.print("*");
            }
            System.out.println();
            temp  = temp + 2;
        }
    }
}

