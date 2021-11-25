package com.github.liupu14.Statistics;

import java.util.*;

public class DescriptiveStatistics {
    private double[] nums;

    public DescriptiveStatistics() {
    }

    public DescriptiveStatistics(double... nums) {
        this.nums = nums;
    }

    public double[] getNums() {
        return nums;
    }

    public void setNums(double... nums) {
        this.nums = nums;
    }

    @Override
    public String toString() {
        return "DescriptiveStatistics{" +
                "nums=" + Arrays.toString(nums) +
                '}';
    }

    //计算最小值
    public static double calMin(double[] nums){
        double temp = Double.POSITIVE_INFINITY;
        for (double num : nums) {
            if(num<=temp){
                temp = num;
            }
        }
        return temp;
    }
    public double getMin(){
        return calMin(this.nums);
    }

    // 计算最大值
    public static double calMax(double[] nums){
        double temp = Double.NEGATIVE_INFINITY;
        for (double num : nums) {
            if(num>=temp){
                temp = num;
            }
        }
        return temp;
    }
    public double getMax(){
        return calMax(this.nums);
    }

    // 计算均值
    public static double calMean(double[] nums){
        double temp = 0.0;
        for (double num : nums) {
            temp += num;
        }
        return temp / nums.length;
    }

    public double getMean(){
        return calMean(this.nums);
    }

    // 计算众数
    public static String calMode(double[] nums){
        Map<Double,Integer> map = new HashMap<>();
        for (double num : nums) {
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            } else {
                map.put(num,1);
            }
        }
        int maxNumbers = Collections.max(map.values());
        if(maxNumbers==1){
            return "No mode";
        }
        List<Double> list = new ArrayList<>();
        for (double key:map.keySet()){
            if(map.get(key)==maxNumbers){
                list.add(key);
            }
        }
        return "Mode is " + list.toString();
    }

    public String getMode(){
        return calMode(this.nums);
    }

    // 计算中位数
    public static double calMedian(double[] nums){
        Arrays.sort(nums);
        if(nums.length/2==0){
            return (nums[nums.length/2-1] + nums[nums.length/2])/2.0;
        } else {
            return nums[nums.length/2];
        }
    }

    public double getMedian(){
        return calMedian(this.nums);
    }

    // 计算极差
    public static double calRange(double[] nums){
        return calMax(nums) - calMin(nums);
    }

    // 计算分位数
    public static double calPercentile(double[] nums,double p){
        Arrays.sort(nums);
        double k = (nums.length-1)*p;
        int up = (int) Math.ceil(k);
        int down = (int) Math.floor(k);
        if(up==down){
            return nums[up];
        } else {
            return (nums[down] + nums[up])/2.0;
        }
    }

    public double getPercentile(double p){
        return calPercentile(this.nums,p);
    }

    // 计算内距
    public static double calIQR(double[] nums){
        return calPercentile(nums,0.75)-calPercentile(nums,0.25);
    }

    public double getIQR(){
        return calIQR(this.nums);
    }

    // 计算方差
    public static double calVAR(double[] nums){
        double average = calMean(nums);
        double temp = 0.0;
        for (double num : nums) {
            temp += (num-average)*(num-average);
        }
        return temp / (nums.length-1);
    }

    public double getVAR(){
        return calVAR(this.nums);
    }

    // 计算标准差
    public static double calStd(double[] nums){
        return Math.sqrt(calVAR(nums));
    }

    public double getStd(){
        return calStd(this.nums);
    }

    // 计算偏度
    public static double calSkewness(double[] nums){
        double temp = 0.0;
        double average = calMean(nums);
        double std = calStd(nums);
        for (double num : nums) {
            temp += Math.pow((num-average),3);
        }
        return temp / nums.length / Math.pow(std,3);
    }

    public double getSkewness(){
        return calSkewness(this.nums);
    }

    // 计算峰度
    public static double calKurtosis(double[] nums){
        double temp = 0.0;
        double average = calMean(nums);
        double std = calStd(nums);
        for (double num : nums) {
            temp += Math.pow((num-average),4);
        }
        return temp / nums.length / Math.pow(std,4);
    }

    public double getKurtosis(){
        return calKurtosis(this.nums);
    }

    // 数组进行标准化
    public static double[] minMaxStandard(double[] nums){
        double[] res = new double[nums.length];
        double range = calRange(nums);
        double min = calMin(nums);
        for (int i = 0; i < nums.length; i++) {
            res[i] = (nums[i]-min) / range;
        }
        return res;
    }

    public static double[] normStandard(double[] nums){
        double[] res = new double[nums.length];
        double average = calMean(nums);
        double std = calStd(nums);
        for (int i = 0; i < nums.length; i++) {
            res[i] = (nums[i] - average) / std;
        }
        return res;
    }

    public double[] getNormalization(String method){
        if("min-max".equals(method)){
            return minMaxStandard(this.nums);
        } else {
            return normStandard(this.nums);
        }
    }

    public double[] getNormalization(){
        return minMaxStandard(this.nums);
    }

    // 计算截尾均值
    public static double calTrimMean(double[] nums,double p){
        Arrays.sort(nums);
        int down = (int) Math.floor(p * nums.length);
        int up = (int) Math.ceil((1-p)*nums.length);
        double[] newArr= Arrays.copyOfRange(nums,down,up);
        return calMean(newArr);
    }

    public double getTrimMean(double p){
        return calTrimMean(this.nums,p);
    }


}
