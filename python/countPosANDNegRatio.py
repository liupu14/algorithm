"""
Given an array A,count the ratio of positive numbers and ratio of negative numbers and zero numbers ratio,
ratio keep 6 digit precision
Example:
A = [1,2,-1,23,-1,0] ----> positive ratio = 0.500000,negative ratio = 0.333333 and zero ratio = 0.166667
"""


def countPosANDNegRatio(lst):
    lst_numbers = len(lst)
    positive_numbers = sum([ii > 0 for ii in lst])
    negative_numbers = sum([ii < 0 for ii in lst])
    zero_numbers = sum([ii == 0 for ii in lst])
    print("正数占比为:{:.6f}".format(positive_numbers / lst_numbers))
    print("负数占比为:{:.6f}".format(negative_numbers / lst_numbers))
    print("0的占比为:{:.6f}".format(zero_numbers / lst_numbers))


if __name__ == "__main__":
    lst = list(map(int, input("输入数组，以空格分割: ").strip().split(" ")))
    countPosANDNegRatio(lst)
