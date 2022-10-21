package ss13_searching_algorithms.exercise.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySeach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("array[%d] = ", i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp: ");
        System.out.println(Arrays.toString(array));

        System.out.print("Nhập số cần tìm kiếm: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(binarySearch(array, 0, array.length - 1, number));
    }

    private static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;
        if (array[middle] == value) {
            return middle;
        }

        if (array[middle] < value) {
            return binarySearch(array, middle + 1, right, value);
        }

        return binarySearch(array, left, middle - 1, value);
    }
}
