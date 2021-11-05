package com.github.liupu14;

import java.util.Scanner;

public class DayOfProgrammer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        printDayOfProgrammer(year);
    }

    private static void printDayOfProgrammer(int year) {
        if (year == 1918){
            System.out.println("26.09.1918");
        } else if (year <= 1917){
            if (year % 4 == 0){
                System.out.println("12.09."+year);
            } else{
                System.out.println("13.09."+year);
            }
        } else {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
                System.out.println("12.09."+year);
            } else {
                System.out.println("13.09."+year);
            }
        }
    }
}
