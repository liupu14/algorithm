"""
Given a matrix A, calculate the minus of the positive diag trace and negative diag trace
Example:
A = [[1,2,3],[2,3,4],[3,4,5]] ------> positive diag trace = 1+3+5=9 and negative diag trace = 3+3+3=9
Input: |positive diag trace - negative diag trace| = |9-9| = 0
"""


def matrixDiagMinus(matrix):
    dim = len(matrix)
    positive_diag = 0
    negative_diag = 0
    for i in range(dim):
        positive_diag += matrix[i][i]
        negative_diag += matrix[i][dim - 1 - i]
    return abs(positive_diag - negative_diag)


if __name__ == "__main__":
    matrix = []
    dim = int(input("矩阵维度为："))
    for ii in range(dim):
        lst = list(map(int, input("输入第{}行元素: ".format(ii + 1)).strip().split(" ")))
        matrix.append(lst)
    print(matrixDiagMinus(matrix))
