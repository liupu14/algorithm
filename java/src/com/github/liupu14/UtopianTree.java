package com.github.liupu14;

import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(utopianTree(n));
    }

    private static int utopianTree(int n ){
        if(n==0){
            return 1;
        } else{
            if(n%2==1){
                return 2 * utopianTree(n-1);
            } else {
                return 1 + utopianTree(n-1);
            }
        }
    }
}
