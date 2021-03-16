package _00_bai_tap_them._01_phan_so.test;

import _00_bai_tap_them._01_phan_so.common.PhanSo;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        PhanSo psTong = new PhanSo();

        //Nhap phan so
        System.out.println("Nhap vao phan so thu nhat:");
        ps1.nhapPS(sc);
        System.out.println("Nhap vao phan so thu hai:");
        ps2.nhapPS(sc);
        //tinh tong hai phan so
        psTong = ps1.congPS(ps2);
        // hien thi hai phan so
        System.out.println("\nPhan so thu nhat la: ");
        ps1.hienThiPS();
        System.out.println("\nPhan so thu nhat la: ");
        ps2.hienThiPS();
        System.out.println("\nPhan so thu nhat la: ");
        psTong.hienThiPS();

        sc.close();

    }
}
