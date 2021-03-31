package _00_bai_tap_them._06_khach_san.test;

import _00_bai_tap_them._06_khach_san.common.KhachSan;
import _00_bai_tap_them._06_khach_san.common.KhachTro;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        KhachSan quanLy = new KhachSan();

        quanLy.nhapDanhSach(sc);

        System.out.println("Nhap vao so cmnd khach tro can tinh tien: ");
        int cmnd = sc.nextInt();
        sc.nextLine();
        System.out.println("==> Tong tien la : " + quanLy.tinhTien(cmnd));

        System.out.println("Nhap vao cmnd can xoa: ");
        int cmnd1 = sc.nextInt();
        sc.nextLine();
        quanLy.xoaKhachTro(cmnd1);



    }
}
