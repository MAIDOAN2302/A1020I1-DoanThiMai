package _01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Tinh_nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("Enter is a year you want to find");
        year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Year " + year +" " + "is a leap year");
                } else {
                    System.out.println("Year " + year + " " + "is not a leap year");
                }
            } else {
                System.out.println("Year " + year + " " + "is  a leap year");
            }
        } else {
            System.out.println("Year " + year + " " + "is not a leap year");
        }
    }
}
