def sumTwoNumbers(a, b):
    return a + b


if __name__ == "__main__":
    print("请输入两个数用于相加：")
    a = int(input("a="))
    b = int(input("b="))
    result = sumTwoNumbers(a, b)
    print("{} + {} = {}".format(a, b, result))
