package com.github.liupu14;

import java.util.Arrays;

public class CommonNumberOperateMethod {

    public static void main(String[] args) {
        double num = 5;
        System.out.println(calSqrt(num));
    }

    //计算整数数组的最大值
    public static int calMax(int[] nums){
        int max = nums[0];
        for (int num : nums) {
            if(num >= max){
                max = num;
            }
        }
        return max;
    }

    //计算浮点数数组的最大值
    public static double calMax(double[] nums){
        double max = nums[0];
        for (double num : nums) {
            if(num >= max){
                max = num;
            }
        }
        return max;
    }

    //计算整数数组元素平均值
    public static double calMean(int[] nums){
        int length = nums.length;
        double sum = 0.0;
        for (int num : nums) {
            sum += num;
        }
        return sum / length;
    }

    //计算浮点数数组元素平均值
    public static double calMean(double[] nums){
        int length = nums.length;
        double sum = 0.0;
        for (double num : nums) {
            sum += num;
        }
        return sum / length;
    }

    //复制整数数组
    public static int[] copyArray(int[] nums){
        int[] b = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            b[i] = nums[i];
        }
        return b;
    }

    //复制浮点数数组
    public static double[] copyArray(double[] nums){
        double[] b = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            b[i] = nums[i];
        }
        return b;
    }

    //逆序数组元素
    public static Object[] reverseArray(Object[] nums){
        for(int ii=0;ii<nums.length/2;ii++){
            Object temp = nums[ii];
            nums[ii] = nums[nums.length-ii-1];
            nums[nums.length-ii-1] = temp;
        }
        return nums;
    }

    //计算整数的绝对值
    public static int calAbs(int num){
        int result = num >= 0 ? num : -num;
        return result;
    }

    //计算浮点数的绝对值
    public static double calAbs(double num){
        double result = num >= 0.0 ? num : -num;
        return result;
    }

    //判断一个数是否为素数
    public static boolean isPrime(int num){
        if (num < 2) return false;
        for(int ii = 2;ii*ii<=num;ii++){
            if (num % ii == 0) return false;
            }
        return true;
        }

    //计算平方根
    public static double calSqrt(double num){
        if(num < 0) return Double.NaN;
        double t = num;
        double err = 1e-15;
        while(calAbs(t-num/t)>err*t){
            t = (num/t + t) / 2.0;
        }
        return t;
    }

    //计算N个数的调和级数
    public static double calH(int N){
        double sum = 0.0;
        for (int ii=1;ii<=N;ii++){
            sum += 1.0 / ii;
        }
        return sum;
    }


}
