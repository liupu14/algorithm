package com.github.liupu14;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,2,4,7};
        System.out.println(quickSort(arr));
    }

    private static int[] quickSort(int[] arr){
        if(arr.length<2){
            return arr;
        }else{
            int pivot = arr[arr.length/2];
            StringBuilder left = new StringBuilder();
            StringBuilder right = new StringBuilder();
            for (int i : arr) {
                if(i<=pivot){
                    left.append(Integer.toString(i));
                } else {
                    right.append(Integer.toString(i));
                }
            }
            return stringToArray(left.toString());



        }
    }

    static int[] stringToArray(String str)
    {

        String[] splitArray = str.split(" ");
        int[] array = new int[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            array[i] = Integer.parseInt(splitArray[i]);
        }
        return array;
    }
}
