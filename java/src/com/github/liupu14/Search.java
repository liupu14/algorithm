package com.github.liupu14;

import java.util.Arrays;

public class Search {

    //贪婪算法查询某个值在数组中的位置
    public static int greedySearch(int[] arr,int k){
        int target_index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==k){
                target_index = i;
                return target_index;
            }
        }
        return -1;
    }

    //二分查找查询某个元素在数组中的位置
    public static int binarySearch(int[] arr,int k){
        Arrays.sort(arr);
        int down = 0;
        int up = arr.length;
        while(down<=up){
            int mid = down + (up-down)/2;
            if (k < arr[mid]){
                up = mid -1;
            } else if(k>arr[mid]){
                down = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
