package com.github.liupu14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DesignerPdfViewer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        List<Integer> heights = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        String word = in.nextLine();
        System.out.println(designerPdfViewer(heights,word));
    }

    private static int designerPdfViewer(List<Integer> heights,String word){
        char[] chars = word.toCharArray();
        int[] char_indexs = new int[chars.length];
        List<Integer> height_values = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            char_indexs[i] = chars[i]-97;
        }
        for (int index : char_indexs){
            height_values.add(heights.get(index));
        }
        int max_height = Collections.max(height_values);
        return max_height * chars.length;
    }
}
