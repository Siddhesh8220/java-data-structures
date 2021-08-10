package com.siddhesh;

public class MethodOverloading {
    //Overloading occurs at compile Time
    //At compile time compiler will decide which function to call based on type of value passed
    public static void main(String[] args) {
        fun("Siddhesh");
        fun(10);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static void fun(int number){
        System.out.println(number);
    }
}
