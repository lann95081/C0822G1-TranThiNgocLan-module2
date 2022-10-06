package ss2_array_and_loop_in_java.practice;

import java.util.Scanner;

public class ApplicationToCalculateInterest {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number of months: ");
        month = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = Double.parseDouble(scanner.nextLine());
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println(" Total of interest: " + totalInterest);

    }
}
