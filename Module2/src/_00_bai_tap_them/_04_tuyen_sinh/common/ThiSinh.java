package _00_bai_tap_them._04_tuyen_sinh.common;

import java.util.Scanner;

public class ThiSinh {
    //thuoc tinh
    private int soBD;
    private String hoTen;
    private String diaChi;
    private String dienUuTien;

    //phuong thuc
    //ham khoi tao khong doi so
    public ThiSinh(){

    }
    //ham khoi tao co doi so

    public ThiSinh(int soBD, String hoTen, String diaChi, String dienUuTien) {
        this.soBD = soBD;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.dienUuTien = dienUuTien;
    }
    // ham nhap
    public void nhapThongTin (Scanner sc){
        System.out.print("\tNhap so bao danh: ");
        soBD = sc.nextInt(); sc.nextLine();
        System.out.print("\tNhap ho ten : ");
        hoTen = sc.nextLine();
        System.out.print("\tNhap dia chi : ");
        diaChi = sc.nextLine();
        System.out.print("\tNhap dien thong tin : ");
        dienUuTien = sc.nextLine();
    }
    public void hienThiThongTin(){
        System.out.println("\tSo bao danh : " + soBD);
        System.out.println("\tSo ho ten : " + hoTen);
        System.out.println("\tSo dia chi : " + diaChi);
        System.out.println("\tSo dien uu tien : " + dienUuTien);
    }
    // ham lay ra thong tin ve so bao danh
    public int getSoBD() {
        return soBD;
    }
}
