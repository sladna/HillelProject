package com.annasladkykh;

import java.util.Scanner;

public class HW8Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type initial sum of deposit: ");
        float initialSumOfDeposit = scanner.nextFloat();
        System.out.print("Type term of deposit in month : ");
        int period = scanner.nextInt();

        for (int i = 1; i <= period; i++) {
            initialSumOfDeposit += initialSumOfDeposit * 0.015;
        }
        System.out.printf("After %d month sum of deposit will be %f", period, initialSumOfDeposit);
    }
}
