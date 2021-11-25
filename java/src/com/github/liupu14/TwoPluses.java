package com.github.liupu14;

public class TwoPluses {
    public static void main(String[] args) {
        System.out.println(twoPluses(grid));
    }

    private static int twoPluses(String[][] grid){
        String[][] newGrid = new String[grid.length+2][grid[0].length+2];
        for(int ii=0;ii<newGrid[0].length;ii++){
            newGrid[0][ii] = "o";
            newGrid[newGrid.length-1][ii] = "o";
        }
        for(int ii=0;ii<newGrid.length;ii++){
            newGrid[ii][0] = "o";
            newGrid[ii][newGrid[0].length-1] = "o";
        }
        for(int ii = 1;ii<newGrid.length-1;ii++){
            for(int jj=1;jj<newGrid[0].length-1;jj++){
                newGrid[ii][jj] = grid[ii-1][jj-1];
            }
        }
    }
}
