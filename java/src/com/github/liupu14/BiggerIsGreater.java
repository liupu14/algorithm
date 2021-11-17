package com.github.liupu14;

import java.util.Scanner;

public class BiggerIsGreater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.next();
        System.out.println(biggerIsGreater(string));
    }

    private static String biggerIsGreater(String string){
        char[] strArray = string.toCharArray();
        int ii = strArray.length-1;
        while (ii>0 && strArray[ii]<=strArray[ii-1]){
            ii--;
        }
        if(ii<=0){
            return "no answer";
        }

        int jj = strArray.length-1;
        while (strArray[jj] <= strArray[ii-1]){
            jj--;
        }
        char temp = strArray[ii-1];
        strArray[ii-1] = strArray[jj];
        strArray[jj] = temp;

        jj = strArray.length-1;
        while (ii<jj){
            temp = strArray[ii];
            strArray[ii] = strArray[jj];
            strArray[jj] =temp;
            ii++;
            jj--;
        }
        StringBuilder st = new StringBuilder();
        st.append(strArray);
        return st.toString();

    }

}
