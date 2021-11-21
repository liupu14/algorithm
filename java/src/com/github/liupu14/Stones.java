package com.github.liupu14;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public interface Stones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(stones(n,a,b));
    }

    private static String stones(int n,int a,int b){
        if (n==1){
            return Integer.toString(0);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i*a+(n-1-i)*b);
        }
        Set<Integer> set = new HashSet<>();
        for (Integer lst : list) {
            set.add(lst);
        }
        Integer[] res = new Integer[set.size()];
        int ii =0;
        for (Integer s : set) {
            res[ii++] = s;
        }
        Arrays.sort(res);
        return Arrays.toString(res);
    }
}
