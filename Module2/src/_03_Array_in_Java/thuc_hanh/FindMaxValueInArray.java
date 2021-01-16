package _03_Array_in_Java.thuc_hanh;

import java.util.Scanner;

public class FindMaxValueInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter is size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Property list: " );
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + ",");
        }
        int max = array[0];
        int index = 0;
        for ( i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
                index = i ;
            }
        }
        System.out.println("\t"+"The largest property value in the list is " + max + " ,at position " + index);
    }
}
