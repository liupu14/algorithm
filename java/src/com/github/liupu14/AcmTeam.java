package com.github.liupu14;

import java.util.*;

public class AcmTeam {
    public static void main(String[] args) {
        String[] topics = {"10101","11110","00010"};
        System.out.println(Arrays.toString(acmTeam(topics)));
    }

    private static int[] acmTeam(String[] topics){
        int subject_length = topics[0].length();
        Map<Integer,Integer> dict = new HashMap<>();
        for (int ii=1;ii<=subject_length;ii++){
            dict.put(ii,0);
        }
        for(int ii=0;ii<topics.length-1;ii++){
            for (int jj=ii+1;jj<topics.length;jj++){
                String target = topics[ii];
                String compare = topics[jj];
                int value = (int) Integer.toBinaryString(Integer.parseInt(target,2) | Integer.parseInt(compare,2))
                        .codePoints().filter(ch->ch=='1').count();
                dict.put(value,dict.get(value)+1);
            }
        }


        //删除dict中value=0的元素
        dict.entrySet().removeIf(entry -> entry.getValue() == 0);

        int max_key = Collections.max(dict.keySet());
        int numbers = dict.get(max_key);
        return new int[]{max_key,numbers};



    }
}
