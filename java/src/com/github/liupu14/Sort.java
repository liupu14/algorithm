package com.github.liupu14;

import java.util.Arrays;
import java.util.List;

public class Sort {

    public static void main(String[] args) {
        int[] list = {1,3,5,2,7};
        System.out.println(Arrays.toString(selectSort(list)));
        System.out.println(Arrays.toString(bubbleSort(list)));
        System.out.println(Arrays.toString(insertSort(list)));

    }

    public static int[] selectSort(int[] nums){
        if(nums == null || nums.length<=1){
            return nums;
        }
        for (int i = 0; i < nums.length-1; i++) {
           for(int j=i+1;j<nums.length;j++){
               if (nums[j] <= nums[i]){
                   swap(nums,i,j);
               }
           }
        }
        return nums;
    }

    public static int[] bubbleSort(int[] nums){
        if (nums==null || nums.length<=1){
            return nums;
        }
        for (int ii = nums.length-1; ii > 0; ii--) {
            for(int jj=0;jj<=ii-1;jj++){
                if(nums[jj] >= nums[jj+1]){
                    swap(nums,jj,jj+1);
                }
            }
        }
        return nums;
    }

    public static int[] insertSort(int[] nums){
        if (nums==null || nums.length<=1){
            return nums;
        }
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int position = i -1;
            while (position>=0){
                if (nums[position]>temp){
                    nums[position+1] = nums[position];
                    position--;
                } else{
                    break;
                }
            }
            nums[position+1] = temp;
        }
        return nums;
    }


    public static void swap(int[] arr,int i,int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
