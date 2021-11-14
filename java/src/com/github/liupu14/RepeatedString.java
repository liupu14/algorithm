package com.github.liupu14;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        in.close();
        System.out.println(repeatedString(n,s));
    }

    private static int repeatedString(int k,String s){
        String substr = s.substring(0,k % s.length());
        int full_number = countChar(s);
        int sub_number = countChar(substr);
        return full_number * (k/s.length()) + sub_number * (k%s.length());
    }

    private static int countChar(String str){
        int full_number = 0;
        char[] str_char = str.toCharArray();
        for (char c : str_char) {
            if(c=='a'){
                full_number++;
            }
        }
        return full_number;
    }
}
