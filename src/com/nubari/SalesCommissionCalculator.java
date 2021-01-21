package com.nubari;

public class SalesCommissionCalculator {
    private int[] frequency = new int[9];

    public int[] getDistribution(int[] salaries) {
        for (int salary : salaries) {
            int position = determineRange(salary);
            frequency[position]++;
        }
        return frequency;
    }

    private int determineRange(int value) {
        switch (value / 100) {
            case 2 -> {
                return 2;
            }
            case 3 -> {
                return 3;
            }
            case 4 -> {
                return 4;
            }
            case 5 -> {
                return 5;
            }
            case 6 -> {
                return 6;
            }
            case 7 -> {
                return 7;
            }
            default -> {
                return 8;
            }
        }
    }

}
