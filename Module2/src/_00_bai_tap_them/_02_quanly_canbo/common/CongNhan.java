package _00_bai_tap_them._02_quanly_canbo.common;

import java.util.Collections;
import java.util.Scanner;

public class CongNhan extends CanBo {
    //thuoc tinh
    private String bac;

    //phuong thuc
    //ham khoi tao khong tham so
    public CongNhan() {

    }

    //ham khoi tao co tham so
    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String bac) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    //ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap bac: ");
        bac = sc.nextLine();
    }

    //ham hien thi Thong Tin
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tBac: " + bac);
    }
}
