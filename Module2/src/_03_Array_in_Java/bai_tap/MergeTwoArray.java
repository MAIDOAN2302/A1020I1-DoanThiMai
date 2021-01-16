package _03_Array_in_Java.bai_tap;

import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array1");
        int size1 = input.nextInt();

        System.out.println("Input element of array1");
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println("Printing array before merge");
        for (int i : arr1) {
            System.out.print(i + ",");
        }

        System.out.println("\n"+"Enter size of array2");
        int size2 = input.nextInt();
        System.out.println("Input element of array2");
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = input.nextInt();
        }
        System.out.println("Printing array1 before merge");
        for (int i : arr2) {
            System.out.print(i + ",");
        }
        int size = size1 + size2;
        System.out.println("\n" + "Size of array3: " + size);
        int[] arr3 = new int[size];

        for (int i = 0; i < arr1.length; i++){
          arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++){
            arr3[arr1.length + i] = arr2[i];
        }
        for (int i:arr3) {
            System.out.println("Element of array3 is : ");
            System.out.print(i + ";");
        }
    }
}
