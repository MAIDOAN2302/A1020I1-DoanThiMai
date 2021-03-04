package _02_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class Tinh_tien_lai_cho_vay {
    public static void main(String[] args) {
        double money =1.0;
        int month = 1;
        double interest_rate  = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();

        System.out.println("Enter number of month");
        month = input.nextInt();

        System.out.println("Enter annual interest rate in percentage");
        interest_rate = input.nextDouble();

        double total_interest_rate = 0;
        for (int i = 0; i < month; i++){
            total_interest_rate += money * (interest_rate/100)/12 * month;
        }
        System.out.println("Total interest rate : " + total_interest_rate);
    }
}
