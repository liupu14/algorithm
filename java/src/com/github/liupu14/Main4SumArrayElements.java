package com.github.liupu14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/*
Given an int array,define a algorithm to sum all elements in array!
Example:
Given array: arr = [1,2,3,4,10,11]
Return : The sum of elements in the arr is 31
 */
public class Main4SumArrayElements {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //int arCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        int result = sumArray(ar);
        System.out.println("The sum of elements in the array is " + result);
        bufferedReader.close();
    }

    public static int sumArray(List<Integer> arrs){
        int temp = 0;
        for (Integer arr : arrs) {
            temp += arr;
        }
        return temp;
    }
}
