package com.github.liupu14;

/*
Given an int array, count the nums of the max value in the array.
Example:
Given a array A = [1,2,3,5,5,5,3] -------> The numbers 0f the max values in the A is 3
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main4CountMaxValuesNums {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(countMaxValuesNums(list));
    }

    private static int countMaxValuesNums(List<Integer> list){
        int num = 0;
        int maxValues = getMax(list);
        for (Integer item : list) {
            if(item==maxValues){
                num++;
            }
        }
        return num;
    }

    private static int getMax(List<Integer> list){
        int temp = 0;
        for (Integer item : list) {
            if(item>=temp){
                temp = item;
            }
        }
        return temp;
    }
}
