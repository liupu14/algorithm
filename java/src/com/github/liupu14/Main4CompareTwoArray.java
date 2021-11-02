package com.github.liupu14;
/*
Given two arrays A  and B ,calculate the number of A > B in common index and the number of A < B
Example:
Given two arrays A = [2,3,4] and B = [1,4,5]
A > B -----> 1 in index 0
B > A -----> 2 in index 1 and 2
Output: 1 2 (1 represent A > B and 2 represent B > A)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main4CompareTwoArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayA = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        List<Integer> arrayB = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        System.out.println(compareTwoArray(arrayA,arrayB));
    }

    public static List<Integer> compareTwoArray(List<Integer> arr1,List<Integer> arr2){
        int aWInNumber = 0,bWinNumber=0;
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) > arr2.get(i)){
                aWInNumber ++;
            } else if(arr1.get(i) < arr2.get(i)){
                bWinNumber++;
            } else{
                continue;
            }
        }
        lst.add(aWInNumber);
        lst.add(bWinNumber);
        return lst;
    }
}

