package _03_Array_in_Java.bai_tap;

import java.util.Scanner;

public class SumValueOfDiagonalOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input size of array1: ");
        int size1 = sc.nextInt();

        System.out.println("Input size of array2: ");
        int size2 = sc.nextInt();

        int[][] arr = new int[size1][size2];
        System.out.println("Input element of array: ");
        for (int i = 0; i < size1; i++){
            for (int j = 0; j < size2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing element of array: ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(" " +  arr[i][j]);
            }
            System.out.println(" ");
        }
        if (size1 == size2){
            int sum1 = 0;
            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[i].length; j++){
                    if (i == j){
                        sum1 += arr[i][j];
                    }
                }
            }
            System.out.println("Sum value diagonal1 of matrix is : " + sum1);
            int sum2 = 0;
            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[i].length; j++){
                    if (i + j == size1 - 1){
                        sum2 += arr[i][j];
                    }
                }
            }
            System.out.println("Sum value diagonal2 of matrix is : " + sum2);
        }else {
            System.out.println("Length of array 1 not equal length of array 2");
        }
    }
}
