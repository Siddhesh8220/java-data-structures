package com.patterns;

//*******
// *****
//  ***
//   *


import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int input = sc.nextInt();
        int c = input;
        while(input > 0){ //condition
            //print space1
            int space = (c - input)/2;
            for(int i = space; i>0;i--){
                System.out.print(" ");
            }
            //print star
            for(int i = input; i>0;i--){
                System.out.print("*");
            }
            //print space
            for(int i = space; i>0;i--){
                System.out.print(" ");
            }
            System.out.println();
            input  = input - 2;
        }
    }
}
