package com.siddhesh;

import java.util.Scanner;

public class CountOccurrence {
    static int count_occurrence(int num, int digit){
        int count = 0;
        int rem;
        while(num>0){
            rem = num % 10;
            if(rem == digit){
                count++;
            }
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Enter a number to be searched");
        int digit = sc.nextInt();
        int count = count_occurrence(num,digit);
        System.out.println(count);
    }
}
