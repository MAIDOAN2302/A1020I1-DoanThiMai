package _15_exception.thuc_hanh.array_index_out_of_bounds_exception;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Integer[] arr = ArrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Nhap vi tri index trong mang ban muon in ra gia tri :");
        int x = scanner.nextInt();
        try {
            System.out.println("Phan tu tai vi tri index " + x + "co gia tri la : " + arr[x]);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("chi so index vuot qua gioi han cua mang !!!");
        }
    }
}
