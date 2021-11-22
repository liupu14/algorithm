package com.github.liupu14;

import java.util.Scanner;

public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c =in.nextInt();
        int m = in.nextInt();
        System.out.println(chocolateFeast(n,c,m));
    }

    private static int chocolateFeast(int n,int c,int m){
        int initial_bar = n / c;
        int initial_wrap = n / c;
        if(initial_wrap<m){
            return initial_bar;
        }
        while (initial_wrap>=m){
            initial_bar += initial_wrap / m;
            initial_wrap = initial_wrap / m + initial_wrap % m;
        }
        return initial_bar;
    }
}
