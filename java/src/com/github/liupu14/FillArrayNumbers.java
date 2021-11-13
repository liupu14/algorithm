package com.github.liupu14;

import java.util.Scanner;

public class FillArrayNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        System.out.println(fillArrayNumbers(s,t,k));

    }

    private static String fillArrayNumbers(String s,String t,int k){
        int numbers = 0;
        for(int ii=0;ii<=Math.min(s.length()-1,t.length()-1);ii++){
            if(s.substring(0,ii+1).equals(t.substring(0,ii+1))){
                numbers ++;
            }
        }
        if (s.length()+t.length()-2*numbers>k){
            return "No";
        } else if((s.length()+t.length()-2*numbers)%2==k%2){
            return "Yes";
        } else if(s.length()+t.length()<k){
            return "Yes";
        } else {
            return "No";
        }
    }
}
