"""
HackerLand University has the following grading policy:

Every student receives a grade in the inclusive range from 0 to 100.
Any grade less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student's grade according to these rules:
 - If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
 - If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
Examples:
 grade = 84 round to 85 (85 - 84 is less than 3)
 grade = 29 do not round (result is less than 38)
 grade = 57 do not round (60 - 57 is 3 or higher)

Inout: an int array
Output: an array
"""


def gradeRound(lst):
    def grading(grade):
        if grade <= 38 or grade % 5 < 3:
            return grade
        else:
            return grade + (5 - grade % 5)

    return [grading(ii) for ii in lst]


if __name__ == "__main__":
    lst = list(map(int, input("输入成绩： ").strip().split(" ")))
    print(gradeRound(lst))
