package com.github.liupu14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QueenCheese {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rq = in.nextInt();
        int cq = in.nextInt();
        int[][] nums = {{5,5},{4,2},{2,3}};
        System.out.println(queenCheese(n,rq,cq,nums));
    }

    private static int queenCheese(int n,int rq,int cq,int[][] nums){
        int numbers = 0;
        Map<String,Integer> moves = new HashMap<>();
        moves.put("S",rq-1);
        moves.put("N",n-rq);
        moves.put("E",n-cq);
        moves.put("W",cq-1);
        moves.put("NE",Math.min(n-cq,n-rq));
        moves.put("NW",Math.min(cq-1,n-rq));
        moves.put("SW",Math.min(cq-1,rq-1));
        moves.put("SE",Math.min(rq-1,n-cq));

        for (int[] num : nums) {
            int r = num[0];
            int c = num[1];
            if(r==rq){
                if(c<cq){
                    moves.put("W",Math.min(cq-c-1,moves.get("W")));
                } else{
                    moves.put("E",Math.min(c-cq-1,moves.get("E")));
                }
            } else if(c==cq){
                if(r<rq){
                    moves.put("S",Math.min(rq-r-1,moves.get("S")));
                } else {
                    moves.put("N",Math.min(c-cq-1,moves.get("N")));
                }
            } else if(c-r==cq-rq){
                if (c<cq && r<rq){
                    moves.put("SW",Math.min(Math.min(cq-c-1,rq-r-1),moves.get("SW")));
                } else if (c>cq && r>rq){
                    moves.put("NE",Math.min(Math.min(c-cq-1,r-rq-1),moves.get("NE")));
                }
            } else if(c+r==cq+rq){
                if(c>cq && r<rq){
                    moves.put("SE",Math.min(Math.min(r-rq-1,c-cq-1),moves.get("SE")));
                } else if(c<cq && r>rq){
                    moves.put("NW",Math.min(Math.min(cq-c-1,r-rq-1),moves.get("NW")));
                }
            }
        }
        for(String loc:moves.keySet()){
            numbers += moves.get(loc);
        }
        return numbers;
    }
}
