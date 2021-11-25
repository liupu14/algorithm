package com.github.liupu14.Statistics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] nums = {1,2,4,2,7,2,9,3};
        System.out.println(DescriptiveStatistics.calRange(nums));
        System.out.println(DescriptiveStatistics.calPercentile(nums,0.6));
        System.out.println(DescriptiveStatistics.minMaxStandard(nums));

        DescriptiveStatistics ds = new DescriptiveStatistics(nums);
        System.out.println(Arrays.toString(ds.getNormalization()));

        System.out.println(DescriptiveStatistics.calTrimMean(nums,0.2));
    }
}
