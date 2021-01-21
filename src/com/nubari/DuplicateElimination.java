package com.nubari;

import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            boolean numberIsNotPresent = true;
            System.out.println("Enter a number ");
            int number = scanner.nextInt();
            if (number >= 10 && number <= 100) {
                for (int existingNumber : numbers) {
                    if (number == existingNumber) {
                        System.out.println("Number already exists in list");
                        numberIsNotPresent = false;
                    }
                }
                if (numberIsNotPresent) {
                    numbers[i] = number;
                }
            } else {
                System.out.println("Number must be between 10 and 100");
                continue;
            }
            for (int value : numbers) {
                if (value != 0) {
                    System.out.print(value);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
