def calCommonFactor(lst):
    Min = min(lst)
    return list(filter(lambda x: all([ii%x == 0 for ii in lst]), range(1,Min//2+1)))


if __name__ == "__main__":
    print(calCommonFactor([20, 30, 12]))
