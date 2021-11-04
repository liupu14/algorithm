package com.github.liupu14;

/*
Given an int number ,print pound tower
Example:
input a number 6, then print
     #
    ##
   ###
  ####
 #####
######
 */

import java.util.Scanner;

public class Main4PrintFormatPound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        printFormatPound(num);
        in.close();
    }

    private static void printFormatPound(int num) {
        for (int i = 0; i < num; i++) {
            String str = "";
            for (int jj=0;jj<=i;jj++){
                str+= "#";
            }
            System.out.printf("%6s%n",str);
        }
    }
}
