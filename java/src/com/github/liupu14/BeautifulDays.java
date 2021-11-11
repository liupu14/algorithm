package com.github.liupu14;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BeautifulDays {
    public static void main(String[] args) {
        System.out.println(beautifulDays(20,23,6));
    }

    private static int beautifulDays(int i,int j,int k){
        List<Integer> list = IntStream.range(i,j+1).boxed().collect(Collectors.toList());
        List<Integer> reverse_list = list.stream().map(x->reverseNum(x)).collect(Collectors.toList());
        List<Integer> result_list = new ArrayList<>();
        for(int ii=0;ii<=j-i;ii++){
            result_list.add(Math.abs(list.get(ii)-reverse_list.get(ii)));
        }
        int numbers = 0;
        for (int item : result_list) {
            if(item % k == 0){
                numbers++;
            }
        }
        return numbers;
    }

    private static int reverseNum(int num){
        String str_num = ""+num;
        String reverse_str_num = new StringBuilder(str_num).reverse().toString();
        int reverse_num = Integer.parseInt(reverse_str_num);
        return reverse_num;
    }
}
