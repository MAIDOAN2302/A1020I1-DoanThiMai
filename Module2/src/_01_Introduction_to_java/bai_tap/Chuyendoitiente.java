package _01_Introduction_to_java.bai_tap;

import java.io.SyncFailedException;
import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        double vnd = 23e3;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào số tiền usd cần đổi: ");
        usd = scanner.nextDouble();
        double exchange = usd * vnd;
        System.out.println("Số tiền quy đổi từ usd sang vnd là: " + exchange);
    }
}
