package _02_Loop_in_Java.thuc_hanh;

import java.util.Scanner;

public class Find_UCLN {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a :");
        a = input.nextInt();
        System.out.println("Enter number b");
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }

        while (a!=b){
            if (a > b){
                a = a -b;
            }else {
                b = b -a;
            }
        }
        System.out.println("Greatest common factor " + a);
    }
}
