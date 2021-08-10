package com.siddhesh;
import java.util.Scanner;

public class Main {

    //public - make available to run from anywhere
    //static - program starts from main function, but we can't create instance of main class as it is starting points so, we use static
    //String args[] - Take string arguments from command line, try running "java Main.java hello" and print args[0]
    //java -d .. Main.java - saves byte code in previous folder
    //javac and java  commands are executables files that are saved in out computer somewhere, we can also give path(computer will automatically find file)
    //package is just folder, it used for some rules like files in rahul package can only access all files in kunal package
    //com.siddhesh - it will create com folder and siddhesh folder inside com folder
    //ctrl + click - to see implementations of java files.
    //default value for output stream is cmd line we can change it to anything like a file.

    public static void main(String[] args) {

        //standard output stream
        System.out.println("Hello World!");
        System.out.println("Enter some string value");
        Scanner input = new Scanner(System.in); //System.in is just keyboard input, we can change it to filestream
        System.out.println(input.next()); //string input only first word , use nextLine() for inputting entire line of words


        //Primitive data types - which cannot be further broken down
        int c = 64; //64 is literal, c is identifier
        int a=200_400_111;
        System.out.println(a);
        //String is not primitive, as String can be broken down into characters which cannot be further broken down
        char character ='a'; //char always uses single quotes
        float marks = 94.14f; //all decimal values are double by default so, we add f to make it float
        double largeDecimalNumbers = 323423.234;
        long largeInteger = 342342342342L; //adding L to avoid default value that is int
        boolean bool = true;


        //We can also create Ref type data types
        Integer r=40; //this uses class

        float val = 3.3423423234f;
        //floating point err - it rounds of values giving output 3.3423424
        System.out.println(val);
    }
}
