package com.github.liupu14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HurdleRace {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> height = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        System.out.println(hurdleRace(k,height));
    }

    private static int hurdleRace(int k, List<Integer> heights){
        int max_values = (int) Statistics.max(heights);
        return max_values>k?max_values-k:0;
    }

}
