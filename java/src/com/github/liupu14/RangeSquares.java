package com.github.liupu14;

import java.util.Scanner;

public class RangeSquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(rangeSquares(a,b));
    }

    private static int rangeSquares(int a,int b){
        return (int)(Math.floor(Math.sqrt(b))) - (int)(Math.ceil(Math.sqrt(a))) + 1;
    }
}
