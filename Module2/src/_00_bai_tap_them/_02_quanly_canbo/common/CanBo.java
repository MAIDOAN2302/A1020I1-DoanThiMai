package _00_bai_tap_them._02_quanly_canbo.common;

import java.util.Scanner;

public class CanBo {
    //thuoc tinh
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;

    //phuong thuc
    // ham khoi tao khong co doi so
    public CanBo() {

    }

    //ham khoi tao co doi so
    public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    //ham nhap thong tin
    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap vao ten: ");
        hoTen = sc.nextLine();
        System.out.print("\tNhap vao ngay sinh (dd/MM/YYYY): ");
        ngaySinh = sc.nextLine();
        System.out.print("\tNhap vao gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("\tNhap vao dia chi: ");
        diaChi = sc.nextLine();
    }

    //ham hien thi Thong Tin
    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen);
        System.out.println("\tNgay sinh: " + ngaySinh);
        System.out.println("\tGioi tinh: " + gioiTinh);
        System.out.println("\tDia chi: " + diaChi);
    }

    //ham lay thong tin ho ten
    public String getHoTen() {
        return this.hoTen;
    }
}
