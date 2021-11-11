def print_day_of_programmer(year):
    if year == 1918:
        print("26.09.1918")
    elif year <= 1917:
        if year % 4 == 0:
            print("12.09.{}".format(year))
        else:
            print("13.09.{}".format(year))
    else:
        if year % 400 == 0 or (year % 4 == 0 and year % 100 != 0):
            print("12.09.{}".format(year))
        else:
            print("13.09.{}".format(year))


if __name__ == "__main__":
    year = int(input("请输入年份: "))
    print_day_of_programmer(year)
