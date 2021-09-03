package com.siddhesh;
import com.arrays.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.lang.Math;

public class practise_exercise {




//    public static void main(String[] args) {
//        int[] arr = {2,1,3,6,4};
//        boolean swap = false;
//        for (int i =0 ;i < arr.length-1; i++){
//            for(int j =0; j<arr.length-i-1;j++){
//                if(arr[j]  > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    swap = true;
//                }
//            }
//            if(swap == false){
//                break;
//            }
//            swap = false;
//        }
//        System.out.println(Arrays.toString(arr));
//    }




//    public static void main(String[] args) {
//        int[] arr = {10,20,30,40,50};
//        int target = 40;
//        int start = 0 ;
//        int end = arr.length-1;
//        while(start <= end){
//            int mid = start + (end - start)/ 2;
//            if (arr[mid] == target){
//                System.out.println(mid);
//                return;
//            }
//            if(target > arr[mid]){
//                start = mid+1;
//            }
//            else{
//                end = mid -1;
//            }
//        }
//    }



//    public static void main(String[] args) {
//        int num = 4;
//        if(num ==0 || num == 10){
//            System.out.println("Prime no");
//            return;
//        }
//        if(num == 4){
//            System.out.println("Not prime");
//            return;
//        }
//        for(int i = 2; i <= Math.sqrt(num); i++){
//            if(num % i == 0){
//                System.out.println("Not prime");
//                return;
//            }
//        }
//        System.out.println("Prime number");
//    }




//    public static void main(String[] args) {
//        int num = 4;
//        int fact = 1;
//        for(int i=1;i<=num;i++){
//            fact = fact * i;
//        }
//        System.out.println(fact);
//    }



//    public static void main(String[] args) {
//        String str = "siddhesh";
//        String reversed = "";
//        int length =  str.length();
//        for(int i = length-1; i>=0 ;i--){
//            reversed += str.charAt(i);
//    }
//        System.out.println(reversed);
//

//    public static void main(String[] args) {
//        String str = "siddhesh";
//        String result = "";
//        HashSet<Character> set = new HashSet();
//        for(int i = 0;i<str.length();i++){
//            if(!set.contains(str.charAt(i))){
//                set.add(str.charAt(i));
//                result += str.charAt(i);
//            }
//        }
//        System.out.println(result);

//-------------------------------------------------------------------------------------------------


//    public static void main(String[] args) {
//        int num = 1634;
//        int temp = num;
//        int len =(int) (Math.log10(num) + 1);
//        int rem = 0;
//        int sum = 0;
//        while(num > 0){
//            rem = num % 10;
//            sum += Math.pow(rem,len);
//            num = num /10;
//        }
//        if(sum == temp){
//            System.out.println("Armstrong");
//        }
//        else{
//            System.out.println("Not a Armstrong");
//        }


//-------------------------------------------------------------------------------------

//        System.out.println("Enter a number");
//        Scanner sc= new Scanner(System.in);
//        int num = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        int c = a+b;
//        int count = 0;
//        System.out.println(0);
//        System.out.println(1);
//        while(count<num-1){
////            if(c == num){
////                System.out.println("The number is fib");
////                return;
////            }
//            c = a+b;
//            a = b;
//            b = c;
//            System.out.println(c);
//            count++;
//        }
////        System.out.println("The is not a fib");
//    }
}
