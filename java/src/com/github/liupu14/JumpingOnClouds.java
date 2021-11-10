package com.github.liupu14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JumpingOnClouds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                        .map(Integer::parseInt)
                                .collect(Collectors.toList());
        Integer[] clouds = list.toArray(new Integer[list.size()]);
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        System.out.println("剩余能量值为：" + jumpingOnClouds(clouds,k));
    }

    private static int jumpingOnClouds(Integer[] clouds,int k){
        int energy = 100;
        int length = clouds.length;
        int initial_index = k % length;
        energy -= clouds[initial_index] * 2 + 1;
        while (initial_index != 0 ){
            initial_index = (initial_index + k) % length;
            energy -= clouds[initial_index] * 2 + 1;
        }
        return energy;
    }
}
