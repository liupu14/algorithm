package com.github.liupu14;
/*
Given an array A,count the ratio of positive numbers and ratio of negative numbers and zero numbers ratio,
ratio keep 6 digit precision
Example:
A = [1,2,-1,23,-1,0] ----> positive ratio = 0.500000,negative ratio = 0.333333 and zero ratio = 0.166667
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main4CountPosANDNegRatio {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        countPosANDNegRatio(list);

    }

    public static void countPosANDNegRatio(List<Integer> arr){
        int arrLength = arr.size();
        double positiveNum = 0;
        double negativeNum = 0;
        double zeroNum = 0;
        for (int item : arr) {
            if (item>0){
                positiveNum++;
            } else if (item<0){
                negativeNum++;
            } else{
                zeroNum++;
            }
        }
        System.out.printf("正数的占比为:%.6f%n",positiveNum/arrLength);
        System.out.printf("负数的占比为:%.6f%n",negativeNum/arrLength);
        System.out.printf("0的占比为:%.6f%n",zeroNum/arrLength);


    }
}
