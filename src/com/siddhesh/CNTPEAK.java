package com.siddhesh;
// CNTPEAK AT CODECHEF
import java.util.*;
import java.lang.*;
import java.io.*;

public class CNTPEAK {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            ArrayList<String> arr = new ArrayList<>();
            gen(arr,"",n);
            int sum = 0;
            for(int i=0;i<arr.size();i++){
                String s = arr.get(i);
                for(int j=1;j<s.length()-1;j++){
                    char ch1 = s.charAt(j);
                    char ch2 = s.charAt(j-1);
                    char ch3 = s.charAt(j+1);
                    int v1 = ch1-'0';
                    int v2 = ch2-'0';
                    int v3 = ch3-'0';
                    if(v1>v2&&v1>v3){
                        sum++;
                    }
                    if(v2>v1&&v1<v3){
                        sum++;
                    }
                }
            }
            System.out.println(sum);
        }
    }
    public static void gen(ArrayList<String> arr,String ssf,int n){
        if(ssf.length() == n){
            arr.add(ssf);
            return;
        }
        gen(arr,ssf+"0",n);
        gen(arr,ssf+"1",n);
        gen(arr,ssf+"2",n);
    }
}


//
//
///* package codechef; // don't place package name! */
//
//import java.util.*;
//        import java.lang.*;
//        import java.io.*;
//
///* Name of the class has to be "Main" only if the class is public. */
//class Codechef
//{
//    public static void main (String[] args) throws java.lang.Exception
//    {
//        // your code goes here
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        while(t-->0){
//            int n = Integer.parseInt(br.readLine());
//            int val = (int)Math.pow(3,(n-3));
//            int ans = 10*(n-2)*val;
//            System.out.println(ans);
//        }
//    }
//}
