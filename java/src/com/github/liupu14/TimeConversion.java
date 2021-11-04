package com.github.liupu14;

/*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 */

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("输入时间(格式为00:00:00AM或者00:00:00PM): ");
        String str = in.next();
        System.out.print("24小时制的时间为: " + timeConversion(str));
    }

    private static String timeConversion(String str) {
        if ("AM".equals(str.substring(str.length()-2))){
            if ("12".equals(str.substring(0,2))){
                return "00" +str.substring(2,8);
            } else{
                return str.substring(0,8);
            }
        } else {
            if ("12".equals(str.substring(0,2))){
                return str.substring(0,8);
            } else{
                return "" + (Integer.parseInt(str.substring(0,2))+12) + str.substring(2,8);
            }
        }
    }
}
