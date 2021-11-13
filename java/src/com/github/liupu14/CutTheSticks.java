package com.github.liupu14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CutTheSticks {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                        .map(Integer::parseInt)
                                .collect(Collectors.toList());
        System.out.println(cutTheSticks(list));
    }

    private static List<Integer> cutTheSticks(List<Integer> list){
        List<Integer> numbers = new ArrayList<>();
        while (list.size()>0){
            numbers.add(list.size());
            int minValue = Collections.min(list);
            list.removeIf(s->s==minValue);
        }
        return numbers;
    }
}
