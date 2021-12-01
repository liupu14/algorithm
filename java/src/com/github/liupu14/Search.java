package com.github.liupu14;

import java.util.Arrays;

public class Search {

    //贪婪算法查询某个值在数组中的位置
    public static int lineSearch(int[] arr,int k){
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

    // 跳跃查找
    public static int jumpSearch(int[] arr,int k){
        int n = arr.length;
        int m = (int) Math.floor(Math.sqrt(n));
        int prev = 0;
        while (arr[Math.min(m,n)-1]<k){
            prev = m;
            m *= 2;
            if (prev >= n){
                return -1;
            }
        }

        while (arr[prev]<k){
            prev++;
            if (prev==Math.min(m,n)){
                return -1;
            }
        }
        if(arr[prev]==k){
            return prev;
        }
        return -1;
    }

    // 差值查找
    public static int interpolationSearch(int[] arr,int lo,int up,int x){
        int pos;
        if(lo<=up && x >= arr[lo] && x <= arr[up]){
            pos = lo + (x-arr[lo])/(arr[up]-arr[lo]) * (up-lo);
            if(arr[pos]==x){
                return pos;
            } else if (arr[pos]<x){
                return interpolationSearch(arr,pos+1,up,x);
            } else {
                return interpolationSearch(arr,lo,pos-1,x);
            }
        }
        return -1;
    }
}
