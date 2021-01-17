package _03_Array_in_Java.bai_tap;

import java.util.Scanner;

public class FindMinValueOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Input element of array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Printing elment of array: ");
        for (int i:arr) {
            System.out.print(" " + i);
        }
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        System.out.println("\n" + "Min value is " + min + " in location is : " +  index);
    }
}
