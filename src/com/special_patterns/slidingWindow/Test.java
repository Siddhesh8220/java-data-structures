package com.special_patterns.slidingWindow;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        int[] arr ={1,2,3,1,2,3};
        String s = testmethod("cacac");
        System.out.println("Hello: "+ s);
    }
    public static String testmethod(String s){
            int a_pointer = 0;
            int b_pointer = s.length()-1;
            boolean flag = false;
            String result = "";
            int i = 0;

            HashMap<Character,Integer> map = new HashMap<>();

            while(i<s.length()){
                if(!map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),i);
                    i++;
                }
                else{
                    //check palindrome
                    String str = s.substring(map.get(s.charAt(i)),i+1);
                    StringBuilder input1 = new StringBuilder();
                    input1.append(str);
                    input1.reverse();
                    if(str.equals(input1.toString()) && result.length() < str.length()){
                        result = str;
                    }
                    System.out.println("Res:"+result);
                    //update initial to new position
                    map.put(s.charAt(i),i);
                    i++;
                    flag = true;
                }
            }
            if(flag == false){
                return s.charAt(0)+"";
            }
            return result;
        }
}
