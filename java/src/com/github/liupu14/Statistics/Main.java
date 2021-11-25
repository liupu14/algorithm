package com.github.liupu14.Statistics;

public class Main {
    public static void main(String[] args) {
        double[] nums = {1,2,4,2,7,2,9,3};
        System.out.println(DescriptiveStatistics.calRange(nums));
        System.out.println(DescriptiveStatistics.calPercentile(nums,0.6));
    }
}
