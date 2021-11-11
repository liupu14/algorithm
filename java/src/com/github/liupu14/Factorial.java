package com.github.liupu14;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    private static BigInteger factorial(int n){
        return n == 1 ? BigInteger.ONE : BigInteger.valueOf(n).multiply(factorial(n-1));
    }
}
