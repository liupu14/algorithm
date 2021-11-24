package com.github.liupu14;

import java.util.Arrays;
import java.util.List;

public class AbsolutePermutation {
    public static void main(String[] args) {
        int n = 12;
        int k = 2;
        System.out.println(absolutePermutation(n,k));
    }

    private static String absolutePermutation(int n, int k){
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i-1] = i;
        }

        if(k==0){
            return Arrays.toString(arr);
        }

        if (n%(2*k)!=0){
            return Arrays.toString(new int[] {-1});
        }

        else{
            int[] newArr = new int[n];
            for(int ii = 1;ii<n;ii+=2*k){
                for(int jj = ii;jj<2*k+ii;jj++){
                    if (jj < k+ii){
                        newArr[jj-1] = k+jj;
                    } else{
                        newArr[jj-1] = jj-k;
                    }

                }

            }
            return Arrays.toString(newArr);
        }
    }
}
