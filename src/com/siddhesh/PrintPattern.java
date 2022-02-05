package com.siddhesh;

public class PrintPattern {
    public static void main(String[] args) {
        /*
         */
        int n=7;
        int i;
        int k = 2*n-2;
        for(i=0;i<n;i++){
            for(int j=0;j<k;j++){
                System.out.print("  ");
            }
            k--;
            for (int j=0;j<i+1;j++){
                System.out.print("   *");
            }
            System.out.println();
        }
    }
}
