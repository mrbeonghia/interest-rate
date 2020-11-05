package com.InterestRate;

import java.util.Scanner;

public class InterestRate {

    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interest_rate = 1.0;
        double total_interest = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = sc.nextDouble();
        System.out.println("Enter number of months: ");
        month = sc.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interest_rate = sc.nextDouble();
        for (int i = 0; i < month; i++) {
            total_interest += money * (interest_rate / 100) / 12;
        }
        System.out.println("Total of interest: " + (total_interest + money));
    }
}
