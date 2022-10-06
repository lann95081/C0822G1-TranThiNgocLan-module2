package ss2_array_and_loop_in_java.practice;

import java.util.Scanner;

public class CheckPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 2) {
            System.out.println(number + " is not a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }
        }
    }
}
