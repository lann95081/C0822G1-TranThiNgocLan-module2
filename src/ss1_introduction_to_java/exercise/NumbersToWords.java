package ss1_introduction_to_java.exercise;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class NumbersToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = scanner.nextInt();
        if (number < 10) {
            switch (number) {
                case 0:
                    System.out.print("zero");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
                default:
                    System.out.println("out of ability");
            }
        } else if (number < 20) {
            switch (number % 10) {
                case 0:
                    System.out.print("ten");
                    break;
                case 1:
                    System.out.print("eleven");
                    break;
                case 2:
                    System.out.print("twelve");
                    break;
                case 3:
                    System.out.print("thirteen");
                    break;
                case 4:
                    System.out.print("fourteen");
                    break;
                case 5:
                    System.out.print("fifteen");
                    break;
                case 6:
                    System.out.print("sixteen");
                    break;
                case 7:
                    System.out.print("seventeen");
                    break;
                case 8:
                    System.out.print("eighteen");
                    break;
                case 9:
                    System.out.print("nineteen");
                    break;
                default:
                    System.out.println("out of ability");
            }
        } else if (number < 100) {
            switch (number / 10) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
                default:
                    System.out.println("out of ability");
            }
            if (number % 10 != 0) {
                switch (number % 10) {
                    case 1:
                        System.out.print("-one");
                        break;
                    case 2:
                        System.out.print("-two");
                        break;
                    case 3:
                        System.out.print("-three");
                        break;
                    case 4:
                        System.out.print("-four");
                        break;
                    case 5:
                        System.out.print("-five");
                        break;
                    case 6:
                        System.out.print("-six");
                        break;
                    case 7:
                        System.out.print("-seven");
                        break;
                    case 8:
                        System.out.print("-eight");
                        break;
                    case 9:
                        System.out.print("-nine");
                        break;
                    default:
                        System.out.println("out of ability");
                }
            }
        } else if (number > 100 && number < 1000) {
            switch (number / 100) {
                case 1:
                    System.out.print("one hundred");
                    break;
                case 2:
                    System.out.print("two hundred");
                    break;
                case 3:
                    System.out.print("three hundred");
                    break;
                case 4:
                    System.out.print("four hundred");
                    break;
                case 5:
                    System.out.print("five hundred");
                    break;
                case 6:
                    System.out.print("six hundred");
                    break;
                case 7:
                    System.out.print("seven hundred");
                    break;
                case 8:
                    System.out.print("eight hundred");
                    break;
                case 9:
                    System.out.print("nine hundred");
                    break;
            }
            if (number % 10 != 0) {
                switch ((number / 10) % 10) {
                    case 2:
                        System.out.print(" and tewnty");
                        break;
                    case 3:
                        System.out.print(" and thirty");
                        break;
                    case 4:
                        System.out.print(" and forty");
                        break;
                    case 5:
                        System.out.print(" and fifty");
                        break;
                    case 6:
                        System.out.print(" and sixty");
                        break;
                    case 7:
                        System.out.print(" and seventy");
                        break;
                    case 8:
                        System.out.print(" and eighty");
                        break;
                    case 9:
                        System.out.print(" and ninety");
                        break;
                }
            } else if (number % 100 != 0) {
                switch (number % 100) {
                    case 11:
                        System.out.print(" eleven");
                        break;
                    case 12:
                        System.out.print(" twelve");
                        break;
                    case 13:
                        System.out.print(" thirteen");
                        break;
                    case 14:
                        System.out.print(" forteen");
                        break;
                    case 15:
                        System.out.print(" fifteen");
                        break;
                    case 16:
                        System.out.print(" sixteen");
                        break;
                    case 17:
                        System.out.print(" seventeen");
                        break;
                    case 18:
                        System.out.print(" eighteen");
                        break;
                    case 19:
                        System.out.print(" nineteen");
                        break;
                }
            } else if (number % 10 != 0) {
                switch (number % 10) {
                    case 1:
                        System.out.print(" one");
                        break;
                    case 2:
                        System.out.print(" two");
                        break;
                    case 3:
                        System.out.print(" three");
                        break;
                    case 4:
                        System.out.print(" four");
                        break;
                    case 5:
                        System.out.print(" five");
                        break;
                    case 6:
                        System.out.print(" six");
                        break;
                    case 7:
                        System.out.print(" seven");
                        break;
                    case 8:
                        System.out.print(" eight");
                        break;
                    case 9:
                        System.out.print(" nine");
                        break;
                }
            }
        }
    }
}


