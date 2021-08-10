package com.siddhesh;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().trim().charAt(0);
        if(c >= 'a' && c <= 'z'){  //converts to ASCII value to compare
            System.out.println("Lowercase");
            System.out.println((int)c);
            System.out.println((int)'A');
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
