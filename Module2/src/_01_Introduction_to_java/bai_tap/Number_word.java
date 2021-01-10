package _01_Introduction_to_java.bai_tap;

import java.util.Scanner;

public class Number_word {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number (3-digit number)");
        int n = in.nextInt();

        if (n < 0 || n > 999) {
            System.out.println("Wrong input, Enter pleas");
        } else {
            int u = n % 10; // so hang don vi
            int tt = n / 10;// lay reult chia lay du
            int t = tt % 10; // so du la so hang chuc
            int h = n / 100;//lay so hang tram
            String uw[] = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
                    "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
            String tw[] = {" ", "Ten ","Twety", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            String hw = "Hundred";

            if (n < 20) {
                System.out.println(uw[n]);
            } else if (n < 100) {
                System.out.println(tw[tt] + " " + uw[u]);// tt lay thuong, u lay du
            } else if (n < 1000) {
                System.out.println(uw[h] + hw + " " + tw[t] + " " + uw[u]);
            }
        }
    }
}
