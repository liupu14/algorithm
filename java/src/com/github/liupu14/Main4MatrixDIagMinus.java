package com.github.liupu14;

/*
Given a matrix A, calculate the minus of the positive diag trace and negative diag trace
Example:
A = [[1,2,3],[2,3,4],[3,4,5]] ------> positive diag trace = 1+3+5=9 and negative diag trace = 3+3+3=9
Input: |positive diag trace - negative diag trace| = |9-9| = 0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main4MatrixDIagMinus {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入矩阵的维度：");
        int dim = in.nextInt();
        Integer[][] matrix = new Integer[dim][dim];
        System.out.println("请按照行的顺序输入矩阵中的各个元素，每个元素间以单个空格分割：");
        for (int i = 0; i < matrix.length; i++) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            List<Integer> list1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            list1.toArray(matrix[i]);
        }
        System.out.println(matrixDiagMinus(matrix));

    }

    public static int matrixDiagMinus(Integer[][] matrix){
        int matrixSize = matrix.length;
        int positiveDiag = 0;
        int negativeDiag = 0;
        for (int i = 0; i < matrixSize; i++) {
            positiveDiag += matrix[i][i];
            negativeDiag += matrix[i][matrixSize-1-i];
        }
        int minus = Math.abs(positiveDiag-negativeDiag);
        return minus;
    }
}
