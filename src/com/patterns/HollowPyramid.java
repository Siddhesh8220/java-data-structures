package com.patterns;

import java.util.Scanner;

//    *
//   * *
//  *   *
// *     *
//* * * * *

//- - - - - - - - -
//        -
//      -   -
//    -       -

// Only works with odd numbers

public class HollowPyramid {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int space = 0;
        int input = sc.nextInt();
        int c = input;
        space = c/2;
        while (space >= 0){ //condition
            //print space
            for(int i = space; i>0; i--){
                System.out.print(" ");
            }
            //print star
                System.out.print("*");
            

            //print space
            if(space != 0) {
                for (int i = (c - ((2 * space) + 2)); i > 0; i--) {
                    System.out.print(" ");
                }
            }
            else{
                boolean flag = false;
                for (int i = (c - ((2 * space) + 2)); i > 0; i--) {
                    if(flag == false){
                        System.out.print(" ");
                        flag = true;
                    }
                    else{
                        System.out.print("*");
                        flag = false;
                    }

                }
            }
            //print star
            if( space != c/2) {
                System.out.print("*");
            }
            //print space
            for(int i = space; i>0; i--){
                System.out.print(" ");
            }
            System.out.println();
            space--;
        }
    }
}
