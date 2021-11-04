"""
Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
"""


def timeConversion(string):
    if string[-2:] == "AM":
        if string[:2] == "12":
            return "00" + string[2:8]
        else:
            return string[:8]
    else:
        if string[:2] == "12":
            return string[:8]
        else:
            return str(int(string[:2]) + 12) + string[2:8]


if __name__ == "__main__":
    string = input("输入12小时制的时间： ")
    print("24小时制的时间为： {}".format(timeConversion(string)))
