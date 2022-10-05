package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD : ");
        double usd = Double.parseDouble(scanner.nextLine());
        double exchange = usd * vnd;
        System.out.println("Số tiền VND: " + exchange + "VNĐ");

    }
}
