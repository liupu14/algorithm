package com.github.liupu14;

import java.util.List;

public class Statistics {

    public static int max(List<Integer> nums){
        int max_value = nums.get(0);
        for (int num : nums) {
            if(num >= max_value){
                max_value = num;
            }
        }
        return max_value;
    }

}
