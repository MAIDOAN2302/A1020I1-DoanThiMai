package _15_exception.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException {
    public static boolean triangle(int a, int b, int c)throws Check{

            if (a < 0 || b < 0 || c < 0){
                throw new Check("Loi nhap so am");
            }else if (a + b < c || b +c < a || c + a < b){
                throw new Check("Hai canh cong lai nho hon canh con lai");
            }
            return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh a : ");
        int a = scanner.nextInt();
        System.out.println("Nhap canh b : ");
        int b = scanner.nextInt();
        System.out.println("Nhap canh c : ");
        int c = scanner.nextInt();

        try {
            if (triangle( a, b, c)){
                System.out.println("Dung");
            }else {
                System.out.println("Sai");
            }
        } catch (Check check) {
            check.printStackTrace();
        }
    }
}
