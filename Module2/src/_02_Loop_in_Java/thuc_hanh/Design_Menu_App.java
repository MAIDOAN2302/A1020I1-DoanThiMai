package _02_Loop_in_Java.thuc_hanh;

import java.util.Scanner;

public class Design_Menu_App {
    public static void main(String[] args) {
        int choose = -1;
        Scanner input = new Scanner(System.in);
        while (choose != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            choose = input.nextInt();

            if (choose == 1) {
                for (int i = 1; i < 5; i++) {
                    for (int j = i; j < 5; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            } else if (choose == 2) {
                for (int i = 1; i < 6; i++) {
                    for (int j = 1; j < 6; j++) {
                        System.out.print("*  ");
                    }
                    System.out.print("\n");
                }
            } else if (choose == 3) {
                for (int i = 1; i < 4; i++) {
                    for (int j = 1; j < 10; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            }
        }
    }
}