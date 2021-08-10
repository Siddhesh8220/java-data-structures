package com.siddhesh;

public class TypeConversion {
    public static void main(String[] args) {

        // maximum value that can store in 1 byte = 11111111 = 255, and total values = 2^8 = 256
        int num = 257;
        byte byte_num = (byte)(num); //storing signed integers from -128 to 127 (256 values incl 0)so value greater than those get converted
        System.out.println(byte_num);

        // automatic type promotion in expressions
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int result = a * b / c; //40*50=2000 which far greater values than byte can hold , so java automatically converts int into int during execution
        // typecasting to int
        System.out.println("नमस्ते"); //java supports unicode

        byte ba = 42;
        char ca = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double res = (f * ba) + (i / ca) - (d * s); //char is using ascii
        // float + int - double = double
        System.out.println((f * ba) + " " + (i / ca) + " " + (d * s));
        System.out.println(res);
    }
}
