package _00_bai_tap_them._05_khupho.test;

import _00_bai_tap_them._05_khupho.common.KhuPho;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        KhuPho quanLyKhuPho = new KhuPho();
        quanLyKhuPho.nhapDanhSach(sc);

        System.out.println("Danh sach ho dan co nguoi 80 tuoi la : ");
        quanLyKhuPho.timKiemThongTin();
    }
}
