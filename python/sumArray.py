"""
Given an int array,define a algorithm to sum all elements in array!
Example:
Given array: arr = [1,2,3,4,10,11]
Return : The sum of elements in the arr is 31
"""

def sumArray(arrs):
    return sum(arrs)


if __name__ == "__main__":
    print("请输入数组中的数字，各个数字之间以空格分割，输入完成输入回车键即可！")
    ar = list(map(int, input().rstrip().split()))
    result = sum(ar)
    print("The sum of elements in arr is {}".format(result))
