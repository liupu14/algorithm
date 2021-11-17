package com.github.liupu14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KaprekarNumbers {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int p = in.nextInt();
//        int q = in.nextInt();
        kaprekarNumbers(1,100);
    }

    private static void kaprekarNumbers(int p,int q){
        List<Integer> lst = new ArrayList<>();
        for(int ii=p;ii<=q;ii++) {
            int digit_length = Integer.toString(ii).length();
            int square = ii * ii;
            String str_square = Integer.toString(square);
            int r = 0, l = 0;
            if (str_square.length() == digit_length) {
                r = Integer.parseInt(str_square);
            } else {
                r = Integer.parseInt(str_square.substring(str_square.length() - digit_length, str_square.length()));
                l = Integer.parseInt(str_square.substring(0, str_square.length() - digit_length));
            }
            int sum = r + l;
            if (sum == ii) {
                lst.add(ii);
            }
        }
        if (lst.size()==0){
            System.out.println("Invalid kaprekarNumbers");
        } else {
            for (Integer integer : lst) {
                System.out.print(integer);
                System.out.print(" ");
            }
        }
    }
}
