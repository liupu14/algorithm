"""
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly
four of the five integers. Then print the respective minimum and maximum values as a single line of two
space-separated long integers.
Example:
Given a arr [1,2,3,4,5]
The minimum sum is 1+2+3+4=10 and the maximum sum is 2+3+4+5=14 The function prints 10 14
"""


def minMaxSum(lst):
    max_sum = sum([ii for ii in lst if ii != min(lst)])
    min_sum = sum([ii for ii in lst if ii != max(lst)])
    print("除去最小值的其它数值和为：{}\t".format(max_sum))
    print("除去最大值的其它数值和为：{}\n".format(min_sum))


if __name__ == "__main__":
    lst = list(map(int, input("输入用于计算的数组: ").strip().split(" ")))
    minMaxSum(lst)
