package com.github.liupu14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(findDigits(n));
    }

    private static int findDigits(Integer n){
        char[] str_num = (""+n).toCharArray();
        List<Integer> list = new ArrayList<>();
        for(char ch:str_num){
            int num = Integer.parseInt(String.valueOf(ch));
            list.add(num);
        }
        int numbers = 0;
        for(int num : list){
            if(n % num == 0){
                numbers++;
            }
        }
        return numbers;
    }
}
