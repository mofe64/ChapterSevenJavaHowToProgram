package com.nubari;

public class VariableListSum {
    public static int sum(int... numbers) {
        int sum = 0;
        for (int value : numbers) {
            sum += value;
        }
        return sum;

    }
}
