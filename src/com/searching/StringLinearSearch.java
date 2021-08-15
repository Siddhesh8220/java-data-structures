package com.searching;

public class StringLinearSearch {
    public static void main(String[] args) {
        String str = "Siddhesh";
        System.out.println(linear_search(str, 'x'));
        System.out.println(linear_search2(str, 'x'));
    }

    static boolean linear_search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++ ){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    static boolean linear_search2(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
