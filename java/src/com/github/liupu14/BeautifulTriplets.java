package com.github.liupu14;

import java.util.HashMap;
import java.util.Map;

public class BeautifulTriplets {
    public static void main(String[] args) {
        int d = 3;
        int[] arr = {1,2,4,5,7,8,10};
        System.out.println(beautifulTriplets(d,arr));
    }

    private static int beautifulTriplets(int d,int[] arr){
        int numbers = 0;
        if(arr.length<=2){
            return numbers;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i,1);
        }

        for (int i = 0; i < arr.length-2; i++) {
            if (map.get(arr[i]+d)!=null && map.get(arr[i]+2*d) != null){
                numbers++;
            }
        }
        return numbers;
    }
}
