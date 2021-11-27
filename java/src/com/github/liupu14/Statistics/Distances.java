package com.github.liupu14.Statistics;

import java.util.Arrays;

public class Distances {
    private double[] nums1;
    private double[] nums2;

    public Distances() {
    }

    public Distances(double[] nums1, double[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
    }

    public double[] getNums1() {
        return nums1;
    }

    public void setNums1(double[] nums1) {
        this.nums1 = nums1;
    }

    public double[] getNums2() {
        return nums2;
    }

    public void setNums2(double[] nums2) {
        this.nums2 = nums2;
    }

    @Override
    public String toString() {
        return "Distances{" +
                "nums1=" + Arrays.toString(nums1) +
                ", nums2=" + Arrays.toString(nums2) +
                '}';
    }

    // 计算欧几里得距离
    public static double calEuclidDistance(double[] nums1,double[] nums2){
        if(nums1.length != nums2.length){
           throw new IllegalArgumentException("数组不一致");
        }
        double temp = 0.0;
        for (int i = 0; i < nums1.length; i++) {
            temp += Math.pow((nums1[i]-nums2[i]),2);
        }
        return Math.sqrt(temp);
    }

    public double getEuclidDistance(){
        return calEuclidDistance(this.nums1,this.nums2);
    }

    // 计算余弦相似度
    public static double calCosineSimilarity(double[] nums1,double[] nums2){
        if(nums1.length != nums2.length){
            throw new IllegalArgumentException("数组不一致");
        }
        double dotProduct = 0.0;
        double nums1Square = 0.0;
        double nums2Square = 0.0;
        for (int i = 0; i < nums1.length; i++) {
            dotProduct += nums1[i] * nums2[i];
            nums1Square += nums1[i] * nums1[i];
            nums2Square += nums2[i] * nums2[i];
        }
        return dotProduct / (Math.sqrt(nums1Square) * Math.sqrt(nums2Square));
    }

    public double getCosineSimilarity(){
        return calCosineSimilarity(this.nums1,this.nums2);
    }

    // 计算曼哈顿距离
    public static double calMahatanDistance(double[] nums1,double[] nums2){
        if(nums1.length != nums2.length){
            throw new IllegalArgumentException("数组不一致");
        }
        double temp = 0.0;
        for (int i = 0; i < nums1.length; i++) {
            temp += Math.abs(nums1[i]-nums2[i]);
        }
        return temp;
    }

    public double getManhatanDistance(){
        return calMahatanDistance(this.nums1,this.nums2);
    }

}
