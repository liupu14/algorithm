"""
Given two arrays A  and B ,calculate the number of A > B in common index and the number of A < B
Example:
Given two arrays A = [2,3,4] and B = [1,4,5]
A > B -----> 1 in index 0
B > A -----> 2 in index 1 and 2
Output: 1 2 (1 represent A > B and 2 represent B > A)
 """


def compareTwoArray(arr1, arr2):
    result = []
    aWinNumber = sum([ii > jj for ii, jj in zip(arr1, arr2)])
    bWinNumber = sum([ii < jj for ii, jj in zip(arr1, arr2)])
    result.append(aWinNumber)
    result.append(bWinNumber)
    return result


if __name__ == "__main__":
    arrayA = list(map(int, input("arrayA=").strip().split()))
    arrayB = list(map(int, input("arrayB=").strip().split()))
    print(compareTwoArray(arrayA, arrayB))
