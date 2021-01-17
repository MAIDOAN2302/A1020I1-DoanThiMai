package _03_Array_in_Java.bai_tap;

import java.util.Scanner;

public class FindMaxOfMultidimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array1 in multidimensional array: ");
        int size1 = sc.nextInt();

        System.out.println("Enter length of array2 in multidimensional array: ");
        int size2 = sc.nextInt();

        int[][] array = new int[size1][size2];

        System.out.println("Input element: ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix from: ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println(" ");
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length;j++){
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }System.out.println("Max value : " + max);
    }
}
