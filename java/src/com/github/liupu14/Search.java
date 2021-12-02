package com.github.liupu14;

import java.util.Arrays;

public class Search {

    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8,9,11,34};
        System.out.println(binarySearch(arr,0,arr.length-1,8));
        System.out.println(exponentialSearch(arr,0,arr.length-1,8));
        System.out.println(ternarySearch(arr,8));
        System.out.println(jumpSearch(arr,8));
        System.out.println(lineSearch(arr,8));
        System.out.println(interpolationSearch(arr,8));
    }

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
    public static int binarySearch(int[] arr,int down,int up, int k){
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

    public static int binarySearch(int[] arr,int x){
        return binarySearch(arr,0,arr.length-1,x);
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

    // 插值查找
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

    public static int interpolationSearch(int[] arr,int x){
        return interpolationSearch(arr,0,arr.length-1,x);
    }

    // 指数查找
    public static int exponentialSearch(int[] arr,int down,int up,int x){
        if (arr[down]==x){
            return down;
        }

        down = 1;
        while (down<up && arr[down]<=x) {
            down *= 2;
        }
        return binarySearch(arr,down/2,Math.min(down,up),x);
    }

    public static int exponentialSearch(int[] arr,int x){
        return exponentialSearch(arr,0,arr.length-1,x);
    }

    // 三元搜索
    public static int ternarySearch(int[] arr, int l, int r, int x) {
        if (r >= l)
        {
            int mid1 = l + (r - l) / 3;
            int mid2 = mid1 + (r - l) / 3;

            // If x is present at the mid1
            if(arr[mid1] == x) {
                return mid1;
            }

            // If x is present at the mid2
            if (arr[mid2] == x) {
                return mid2;
            }

            // If x is present in left one-third
            if (arr[mid1] > x) {
                return ternarySearch(arr, l, mid1 - 1, x);
            }

            // If x is present in right one-third
            if (arr[mid2] < x) {
                return ternarySearch(arr, mid2 + 1, r, x);
            }

            // If x is present in middle one-third
            return ternarySearch(arr, mid1 + 1,
                    mid2 - 1, x);
        }

        // We reach here when element is
        // not present in array
        return -1;
    }

    public static int ternarySearch(int[] arr,int x){
        return ternarySearch(arr,0,arr.length-1,x);
    }
}
