package com.github.liupu14;

import java.util.ArrayList;
import java.util.List;

public class ServiceLane {
    public static void main(String[] args) {
        int[] arrs = {2,3,1,2,3,2,3,3};
        int[][] cases = {{0,3},{4,6}};
        System.out.println(serviceLane(arrs,cases));
    }

    private static List<Integer> serviceLane(int[] arrs,int[][] cases){
        List<Integer> numbers = new ArrayList<>();
        for (int[] aCase : cases) {
            int num = Integer.MAX_VALUE;
            for(int ii = aCase[0];ii<=aCase[1];ii++){
                if(arrs[ii]<=num){
                    num = arrs[ii];
                }
            }
            numbers.add(num);
        }
        return numbers;
    }
}
