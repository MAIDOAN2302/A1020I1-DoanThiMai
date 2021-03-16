package _00_bai_tap_them._02_quanly_canbo.common;

import java.util.Scanner;

public class NhanVien extends CanBo {
    //thuoc tinh
    private String congViec;

    // phuong thuc
    //ham khoi tao khong co doi so
    public NhanVien() {

    }

    //ham khoi tao co doi so
    public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    //ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap cong viec: ");
        congViec = sc.nextLine();
    }

    // ham hien thi thong tin
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tCong viec: " + congViec);
    }
}
