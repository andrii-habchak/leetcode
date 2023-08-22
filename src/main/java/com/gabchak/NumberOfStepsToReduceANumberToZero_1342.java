package com.gabchak;

public class NumberOfStepsToReduceANumberToZero_1342 {

    public int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                //even
                num = num / 2;
            } else {
                //odd
                num = num - 1;
            }
            steps++;
        }
        return steps;
    }
}
