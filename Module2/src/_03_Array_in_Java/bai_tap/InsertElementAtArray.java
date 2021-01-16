package _03_Array_in_Java.bai_tap;

import java.util.Scanner;

public class InsertElementAtArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of Array");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Input element of array");
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Printing element before insert: ");
        for (int i:arr) {
            System.out.print(i + ",");
        }
        System.out.println("\n"+"Enter the location you want to insert: ");
        int location = scanner.nextInt();

        System.out.println("Enter the value you want to insert: ");
        int value = scanner.nextInt();

        for (int i = arr.length-1; i > location; i--){
            arr[i] = arr[i - 1];
        }
        arr[location] = value;
        for (int i:arr) {
            System.out.print(i + ",");

        }
    }
}
