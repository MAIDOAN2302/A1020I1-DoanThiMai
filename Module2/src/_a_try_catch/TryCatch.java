package _a_try_catch;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so a :");
        double a = sc.nextInt();
        System.out.println("Moi ban nhap so b :");
        double b = sc.nextInt();

//        int ketqua = a/b;
//        System.out.println(ketqua);
        // Loi exception

        double ketqua = 0;
        try {
            ketqua = a/b;
        }catch (Exception e){
            System.out.println("Ban gap loi chia cho 0");
        }finally {// du gap loi hay khong no van chay lenh nay, sau nay doi voi TH cua file
            // du doc duoc file hay k thi van in ra file do.
            // cau statement trong nay luon luon chay du satement trong try co dung hay k dung.
            System.out.println("xin chao, toi la finally");
        }
        System.out.println("ket qua cua a chia cho b la : " + ketqua);

    }
}
