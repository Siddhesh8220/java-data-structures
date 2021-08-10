package com.siddhesh;


//we can use return in void it will terminate function at that point
//java only has pass by value
//https://www.geeksforgeeks.org/g-fact-31-java-is-strictly-pass-by-value/

public class Functions {
    static int sum(int c, int d){ //Parameters | parameters are just copies referencing to same obj but if we change the values of this params ref will change
        return c+d;  //it depends on java if these copies will ref same value or, it will create a new object
    }
    public static void main(String[] args) {
        int a = 10; // a is ref variable and identifier, 10 is object, literal
        int b = 20;
        int sum = sum(10,20);   // Arguments
        int[] arr={0};
    }
}
