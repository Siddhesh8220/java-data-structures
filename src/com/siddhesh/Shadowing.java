package com.siddhesh;

public class Shadowing {
    static int c = 100;
    public static void main(String[] args) {
        int c = 10;
        int x = 10;
        System.out.println("c in scope: "+c);
        fun();
        {
            //int x =20; //will give error as shadowing does not work with methods class variables are fine like we can see in example
            System.out.println("x local: "+x);
            x = 20; // shadowed global variable
        }
        System.out.println("x: "+x);
    }

    static void fun(){
        System.out.println("c: "+c);
    }
}
