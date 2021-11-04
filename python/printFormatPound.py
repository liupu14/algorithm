"""
Given an int number ,print pound tower
Example:
input a number 6, then print
     #
    ##
   ###
  ####
 #####
######
"""


def printFormatPound(number):
    for ii in range(number):
        print("{:>{}s}".format("#" * (ii + 1), number))


if __name__ == "__main__":
    number = int(input("输入需要打印的行数: "))
    printFormatPound(number)
