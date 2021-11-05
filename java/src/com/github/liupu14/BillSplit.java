package com.github.liupu14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BillSplit {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        int kill = in.nextInt();
        int bonus = in.nextInt();
        printBillSplit(list,kill,bonus);
    }

    private static void printBillSplit(List<Integer> bill,int k,int b) {
        List<Integer> bill_copy = new ArrayList<>(bill);
        bill_copy.remove(k);
        int temp = 0;
        for (Integer item : bill_copy) {
            temp += item;
        }
        int need_charge = temp  / 2;
        if (need_charge < b){
            System.out.println(b-need_charge);
        } else{
            System.out.println("Bon Applet");
        }
    }
}
