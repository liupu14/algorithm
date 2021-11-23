package com.github.liupu14;

public class SurfaceArea {
    public static void main(String[] args) {
        int[][] nums = {{1,3,4},{2,3,3},{1,1,4}};
        System.out.println(surfaceArea(nums));
    }

    private static int surfaceArea(int[][] A){
        int r = A.length;
        int c = A[0].length;
        int firstLineSum = 0;
        int lastLineSum = 0;
        int firstColumnSum = 0;
        int lastColumnSum = 0;
        for (int i : A[0]) {
            firstLineSum += i;
        }
        for (int i : A[r - 1]) {
            lastLineSum += i;
        }
        for (int ii=0;ii<r;ii++){
            firstColumnSum += A[ii][0];
            lastColumnSum += A[ii][c-1];
        }

        int rowCumSum = 0;
        int columnCumSum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c-1; j++) {
                rowCumSum += Math.abs(A[i][j]-A[i][j+1]);
            }
        }

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r-1; j++) {
                columnCumSum += Math.abs(A[j][i]-A[j+1][i]);
            }
        }
        return 2*r*c + firstColumnSum+firstLineSum+lastColumnSum+lastLineSum+rowCumSum+columnCumSum;

    }
}
