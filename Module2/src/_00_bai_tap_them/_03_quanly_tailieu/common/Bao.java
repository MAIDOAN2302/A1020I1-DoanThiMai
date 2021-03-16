package _00_bai_tap_them._03_quanly_tailieu.common;

import java.util.Scanner;

public class Bao extends TaiLieu{
    // thuoc tinh
    private String ngayPhathanh;
    //phuong thuc
    // ham khoi tao khong co doi so
    public Bao(){

    }
    // ham khoi tao co doi so

    public Bao(String maTaiLieu, String tenNXB, int soBanPhatHanh, String ngayPhathanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.ngayPhathanh = ngayPhathanh;
    }
    // ham nhap
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("\tNhap ngay phat hanh: ");
        ngayPhathanh = sc.nextLine();
    }
    // ham hien thi thong tin
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tNgay phat hanh: " + ngayPhathanh);
    }
}
