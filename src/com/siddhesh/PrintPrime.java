package com.siddhesh;

import java.util.Scanner;

public class PrintPrime {
    static boolean isPrime(int num){
        if(num == 1 || num == 2 ){
            return true;
        }
        if (num == 4){
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number<1){
            System.out.println("Nan");
            return;
        }
        for(int i=1;i<=number;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
}
