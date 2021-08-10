package com.siddhesh;

public class DotEquals {
    public static void main(String[] args) {
        String a = "Hello"; //
        String b = "Hello"; // a and b pointing to same ref
        System.out.println(a==b);
        System.out.println(a.equals(b));
        a+=" Hii"; // changing a
        System.out.println(b);
        System.out.println(a==b); // now a and b have diff references
        System.out.println(a.equals(b));
    }
}
