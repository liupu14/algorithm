package com.github.liupu14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
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
 */
public class GradeRound {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> gradeList = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> list = gradeList.stream().map(s->grading(s)).collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    private static int grading(Integer s) {
        if (s < 38 || s % 5 < 3){
            return s;
        } else {
            return s + (5-s%5);
        }
    }
}
