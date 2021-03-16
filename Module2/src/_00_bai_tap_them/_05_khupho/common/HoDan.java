package _00_bai_tap_them._05_khupho.common;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
    //thuoc tinh
    private int soNguoi;
    private int soNha;
    private Nguoi[] list;//list la mang danh sach chua cac thanh vien trong ho

    //phuong thuc
    //ham khoi tao khong doi so
    public HoDan() {
        list = new Nguoi[10];

    }
    // ham khoi tao co doi so

    public HoDan( int soNguoi, int soNha, Nguoi[] list) {
        this.soNguoi = soNguoi;
        this.soNha = soNha;
        this.list = list;
    }

    //ham nhap thong tin
    public void nhapThongTinHodan(Scanner sc) {
        System.out.print("\tSo nguoi: ");
        soNguoi = sc.nextInt();
        sc.nextLine();
        System.out.print("\tSo nha: ");
        soNha = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap thong tin cho tung nguoi trong ho: ");
        for (int i = 0; i < soNguoi; i++) {
            System.out.println("\tNguoi thu " + (i + 1) + " la :");
            list[i] = new Nguoi();
            list[i].nhapThongTin(sc);
        }
    }

    // ham hien thi thong tin
    public void hienThiThongTin() {
        System.out.println("\tSo nguoi : " + soNguoi);
        System.out.println("\tSo nha : " + soNha);
        System.out.println("\tThong tin cua tung nguoi trong gia dinh: ");
        for (int i = 0; i < soNguoi; i++) {
            System.out.println("\tNguoi thu " + (i + 1) + " la: ");
            list[i].hienThiThongTin();
        }
    }

    // ham hien thi ra thanh vien trong ho
    public Nguoi[] getList() {
        return list;
    }
    // ham lay ra so thanh vien trong ho gia dinh

    public int getSoNguoi() {
        return soNguoi;
    }
}
