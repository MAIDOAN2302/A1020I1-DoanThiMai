package _03_array_in_java.bai_tap;

import java.util.Scanner;

public class RemoveOneElementInArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input size of Array");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Input element of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Printing element before delete: ");
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println("\n" + "Enter number you want to delete: ");
        int num = input.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {
            if (num == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
            System.out.print(arr[i] + ",");
        }
    }
}
