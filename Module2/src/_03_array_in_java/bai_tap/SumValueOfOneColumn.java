package _03_array_in_java.bai_tap;

import java.util.Scanner;

public class SumValueOfOneColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input size of array1: ");
        int size1 = sc.nextInt();

        System.out.println("Input size of array2: ");
        int size2 = sc.nextInt();

        int[][] arr = new int[size1][size2];
        System.out.println("Input element of arr: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matris From : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(" ");
        }
        int sum = 0;
        int location;
        System.out.println("Input location of column you want calculator sum: ");
        location = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == location) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum value of column is: " + sum);
    }
}
