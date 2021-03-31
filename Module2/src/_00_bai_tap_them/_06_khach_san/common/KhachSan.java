package _00_bai_tap_them._06_khach_san.common;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
    // thuoc tinh
    private ArrayList<KhachTro> ds;

    //phuong thuc
    // ham khoi tao
    public KhachSan() {
        ds = new ArrayList<KhachTro>(10);
    }

    // ham them khach tro
    public void themKhachTro(KhachTro khachTro) {
        ds.add(khachTro);
    }

    //ham xoa khach tro
    public void xoaKhachTro(int cmnd1) {
        for (KhachTro khach: ds){
            if (khach.getCmnd() == cmnd1){
                ds.remove(cmnd1);
            }
        }
    }

    // ham nhap danh sach
    public void nhapDanhSach(Scanner sc) {
        KhachTro khach;

        System.out.print("\tNhap vao so luong khach: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.print("\tNhap vao danh sach khach tro : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Khach tro thu " + (i + 1) + " la : ");
            khach = new KhachTro();
            khach.nhapThongTin(sc);
            themKhachTro(khach);
        }
    }

    // ham hien thi danh sach
    public void hienThiDanhSac() {
        for (KhachTro khach : ds) {
            khach.hienThiThongTin();
        }
    }

    //ham tinh tien
    public double tinhTien(int cmnd) {
        double tien = 0;
        for (KhachTro khach : ds) {
            if (khach.getCmnd() == cmnd) {
                tien = khach.getSoNgayTro() * khach.getGiaPhong();
            }
        }
        return tien;
    }
}
