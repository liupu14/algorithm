package com.github.liupu14;

import java.util.ArrayList;
import java.util.List;

public class LarrysArray {
    public static void main(String[] args) {
        System.out.println(larrysArray(new int[] {1,2,3,5,4}));
    }

    private static String larrysArray(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    list.add(1);
                }
            }
        }
        int sum = list.stream().reduce(0,(a,b)->a+b);
        if(sum%2==0){
            return "YES";
        } else {
            return "NO";
        }
    }
}
