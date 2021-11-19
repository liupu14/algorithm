package com.github.liupu14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FlatlandSpaceStations {
    public static void main(String[] args) {
        int n = 5;
        int[] c = {0,4};
        System.out.println(flatlandSpaceStations(n,c));
    }

    private static int flatlandSpaceStations(int n,int[] c){
        Arrays.sort(c);
        List<Integer> list = new ArrayList<>();
        if(c.length==1){
            return Math.max(c[0],n-1-c[0]);
        }
        for (int i = 0; i < c.length-1; i++) {
            list.add(c[i+1]-c[i]);
        }
        int max_range = Collections.max(list);
        int possible_max = max_range/2 + max_range%2;
        return Math.max(n-1-c[c.length-1],Math.max(possible_max,c[0]));
    }
}
