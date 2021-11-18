package com.github.liupu14;

import java.util.Scanner;

public class HowManyGames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        System.out.println(howManyGames(p,d,m,s));
    }

    private static int howManyGames(int p,int d,int m,int s){
        if(p>s){
            return 0;
        }
        int new_p = p;
        int total_cost = p;
        int numbers = 0;
        while (total_cost<=s){
            numbers++;
            new_p -= d;
            if (new_p>m){
                total_cost += new_p;
            } else{
                total_cost += m;
            }
        }
        return numbers;
    }
}
