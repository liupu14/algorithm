package com.github.liupu14;

import java.util.Scanner;

public class StringEncryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(encryption(str));
        in.close();
    }

    private static String encryption(String string){
        String str = string.replaceAll(" ","");
        int str_length = str.length();
        int down = (int) Math.floor(Math.sqrt(str_length));
        int up = (int) Math.ceil(Math.sqrt(str_length));
        int row=0,column=0;
        if(down*up<=str_length){
            row = up;
            column = up;
        } else {
            row = down;
            column = up;
        }

        StringBuilder final_string = new StringBuilder(str);
        for(int ii=0;ii<row*column-str_length;ii++){
            final_string.append(" ");
        }

        StringBuilder result = new StringBuilder();
        for(int ii=0;ii<column;ii++){
            for(int jj=0;jj<row;jj++){
                result.append(final_string.substring(ii+jj*4,ii+jj*4+1));
            }
            result.append(" ");
        }
        String medium_res = result.toString();
        String res = medium_res.replaceAll("\\s+$","").replaceAll("  "," ");
        return res;
    }
}
