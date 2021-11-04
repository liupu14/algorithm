"""
Given an int array, count the nums of the max value in the array.
Example:
Given a array A = [1,2,3,5,5,5,3] -------> The numbers 0f the max values in the A is 3
"""


def countMaxValuesNums(lst):
    return sum([ii >= max(lst) for ii in lst])


if __name__ == "__main__":
    lst = list(map(int, input("输入用于统计的数组： ").strip().split(" ")))
    print("最大的数出现了{}次".format(countMaxValuesNums(lst)))
