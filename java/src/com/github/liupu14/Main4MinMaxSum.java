package com.github.liupu14;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly
four of the five integers. Then print the respective minimum and maximum values as a single line of two
space-separated long integers.
Example:
Given a arr [1,2,3,4,5]
The minimum sum is 1+2+3+4=10 and the maximum sum is 2+3+4+5=14 The function prints 10 14
 */
public class Main4MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        printMinMaxSum(list);
    }

    private static void printMinMaxSum(List<Integer> arr) {
        List<Integer> maxList = new ArrayList<>(arr);
        List<Integer> minList = new ArrayList<>(arr);
        Collections.sort(maxList);
        maxList.remove(0);
        minList.sort((d1, d2) -> {
            return d2 - d1;
        });
        minList.remove(0);
        System.out.println(Main4SumArrayElements.sumArray(minList) + " " + Main4SumArrayElements.sumArray(maxList));

    }

}
