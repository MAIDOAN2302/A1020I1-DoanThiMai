package _00_bai_tap_them._02_quanly_canbo.common;

import java.util.Scanner;

public class KySu extends CanBo {
    //thuoc tinh
    private String nganhDaoTao;

    //phuong thuc
    //ham khoi tao khong co doi so
    public KySu() {

    }
    //ham khoi tao co doi so

    public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    //ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap nganh dao tao: ");
        nganhDaoTao = sc.nextLine();
    }

    //ham hien thi Thong Tin
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tNganh dao tao: " + nganhDaoTao);
    }
}
