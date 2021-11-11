package com.github.liupu14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AngryProfessor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                        .map(Integer::parseInt)
                                .collect(Collectors.toList());
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        System.out.println(angryProfessor(a,k));
    }

    private static String angryProfessor(List<Integer> a,int k){
        int arrive_numbers = 0;
        for (Integer st : a) {
            if(st<=0){
                arrive_numbers++;
            }
        }
        if(arrive_numbers>=k){
            return "NO";
        } else {
            return "YES";
        }
    }
}
