package com.github.liupu14;

import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        int m1 = in.nextInt();
        int m2 = in.nextInt();
        int y1 = in.nextInt();
        int y2 = in.nextInt();
        System.out.println("Fine is " + libraryFine(d1,m1,y1,d2,m2,y2));
    }

    private static int libraryFine(int d1,int m1,int y1,int d2,int m2,int y2){
        if (y1<y2){
            return 0;
        } else if(y1>y2){
            return 10000;
        } else{
            if(m1<m2){
                return 0;
            } else if(m1>m2){
                return (m1-m2) * 500;
            } else {
                if(d1<=d2){
                    return 0;
                } else {
                    return 15 * (d1-d2);
                }
            }
        }
    }
}
