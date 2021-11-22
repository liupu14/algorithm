package com.github.liupu14;

import java.util.HashSet;
import java.util.Set;

public class HappyLadybugs {
    public static void main(String[] args) {
        String str = "RBY_YBR";
        System.out.println(happyLadybugs(str));
    }

    private static String happyLadybugs(String str){
        char[] strArray = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : strArray) {
            set.add(c);
        }
        for (Character ch : set) {
            if(!ch.equals('_') && str.chars().filter(a->a==ch).count()==1){
                return "NO";
            }
        }
        if (str.chars().filter(ch->ch=='_').count()==0){
            for (int ii = 1;ii<strArray.length-1;ii++){
                if(strArray[ii-1] != strArray[ii] && strArray[ii] != strArray[ii+1]){
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
