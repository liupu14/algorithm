package com.github.liupu14;

public class StrangerCounter {
    public static void main(String[] args) {
        int t = 4;
        System.out.println(strangerCounter(t));
    }

    private static int strangerCounter(int t){
        int rem = 3;
        while(rem < t){
            t = t - rem;
            rem *= 2;
        }
        return rem-t+1;
    }
}
