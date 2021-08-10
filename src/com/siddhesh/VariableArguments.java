package com.siddhesh;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,7,8,8,10); // we can't overload varargs with no values passed as an argument
        fun2(10,20,"Rahul","Siddhesh","Sahil", "Nilesh");
    }
    static void fun(int ...arr){ //var arg stores value as array
        System.out.println(Arrays.toString(arr));
    }
    static void fun2(int a, int b, String ...arr){ //VariableArguments should always be last parameter
        System.out.println(Arrays.toString(arr));
    }
}
