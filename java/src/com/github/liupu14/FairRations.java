package com.github.liupu14;

import java.util.ArrayList;
import java.util.List;

public class FairRations {
    public static void main(String[] args) {
        int[] B = {2,3,4,5,6};
        System.out.println(fairRations(B));
    }

    private static String fairRations(int[] B){
        int odd_numbers = 0;
        for (int i : B) {
            if(i%2!=0){
                odd_numbers++;
            }
        }
        if(odd_numbers%2!=0){
            return "NO";
        }

        List<Integer> list = new ArrayList<>();
        for (int i : B) {
            list.add(i);
        }
        int numbers = 0;
        while(list.size()>0){
            int num = list.get(list.size()-1);
            if(num%2==0){
                list.remove(list.size()-1);
            } else{
                numbers++;
                list.remove(list.size()-1);
                int last_number = list.get(list.size()-1);
                list.remove(list.size()-1);
                list.add(last_number+1);
            }
        }
        return Integer.toString(numbers*2);

    }
}
