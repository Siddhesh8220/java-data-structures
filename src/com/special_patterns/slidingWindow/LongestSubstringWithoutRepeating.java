package com.special_patterns.slidingWindow;
//leetCode
import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String str = "bbbbbb";
        int result = lengthOfLongestSubstring(str);
        System.out.println(result);
    }
    public static int lengthOfLongestSubstring(String str) {
        int a_pointer = 0;
        int b_pointer = 0;
        int result = 0;
        HashSet<Character> set = new HashSet<Character>();
        while(b_pointer < str.length()){
            if(!set.contains(str.charAt(b_pointer))){
                set.add(str.charAt(b_pointer));
                b_pointer++;
                result = Math.max(result, set.size());
            }
            else{
                set.remove(str.charAt(a_pointer));
                a_pointer++;
            }
        }
        return result;
    }
}
