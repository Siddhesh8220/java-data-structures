package com.siddhesh;

import java.util.HashMap;
import java.util.*;

public class OccourenceOfChar {
    public static void main(String args[]){
        String str = "siddhesh";
        Map<Character,Integer> map = new HashMap();
        for(int i=0; i <str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        for(char c : map.keySet()){
            System.out.println(c+":"+map.get(c));
        }
    }
}
