package _02_Loop_in_Java.bai_tap;

import java.util.Scanner;

public class Display_Symbol {
    public static void main(String[] args) {
        int choose = -1;
        Scanner input = new Scanner(System.in);
        while (choose != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            choose = input.nextInt();

            if (choose == 1) {
                for (int i = 1; i < 4; i++) {
                    for (int j = 1; j < 10; j++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
            }
            if (choose == 2) {
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
            }
            if (choose == 3) {
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
            }

        }
    }
}
