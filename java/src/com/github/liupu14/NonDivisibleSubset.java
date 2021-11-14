package com.github.liupu14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonDivisibleSubset {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                        .map(Integer::parseInt)
                                .collect(Collectors.toList());
        System.out.println(nonDivisibleSubset(k,s));
    }

    private static int nonDivisibleSubset(Integer k, List<Integer> list){
        List<Integer> lst = new ArrayList<>();
        for(int ii=0;ii<k;ii++){
            lst.add(0);
        }
        for (Integer item : list) {
            lst.set(item%k,lst.get(item%k)+1);
        }

        int count = Math.min(lst.get(0),1);
        for(int ii =1;ii<k/2+1;ii++){
            if (ii != k-ii){
                count += Math.max(lst.get(ii),lst.get(k-ii));
            }
        }

        if (k % 2 ==0){
            count += 1;
        }
        return count;

    }
}
