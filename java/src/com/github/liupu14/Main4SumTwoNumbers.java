package com.github.liupu14;

/*
Complete the function solveMeFirst to compute the sum of two integers.

Example
a=7;
b=3;
return:10

Function Description

Complete the solveMeFirst function in the editor below.

solveMeFirst has the following parameters:

int a: the first value
int b: the second value

 */

import java.util.Scanner;

public class Main4SumTwoNumbers {
    public static void main(String[] args) {
        System.out.println("请输入两个数用于计算：");
        System.out.print("a=");
        Scanner input = new Scanner(System.in);
        int a  = input.nextInt();
        System.out.print("b=");
        int b = input.nextInt();
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }
}
