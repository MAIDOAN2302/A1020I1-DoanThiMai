package _00_bai_tap_them._05_khupho.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
    // thuoc tinh
    private ArrayList<HoDan> danhSachHoDan;

    //phuong thuc
    // ham khoi tao
    public KhuPho() {
        danhSachHoDan = new ArrayList<HoDan>(10);
    }

    // ham them mot ho dan
    public void themHoDan(HoDan hoDan) {
        danhSachHoDan.add(hoDan);
    }

    // ham nhap vao danh sach ho dan
    public void nhapDanhSach(Scanner sc) {
        HoDan hoDan;

        System.out.print("\tNhap vao so ho dan: ");
        int soHoDan = sc.nextInt();
        sc.nextLine();

        System.out.println("\tNhap vao thong tin cho tung ho dan: ");
        for (int i = 0; i < soHoDan; i++) {
            System.out.println("\tHo dan thu " + (i + 1) + " la : ");
            hoDan = new HoDan();
            hoDan.nhapThongTinHodan(sc);
            themHoDan(hoDan);
        }
    }

    // ham hien thi danh sach
    public void hienThiDanhSac() {
        int n = danhSachHoDan.size();

        for (int i = 0; i < n; i++) {
            System.out.println("Ho dan thu " + (i + 1) + " la: ");
            danhSachHoDan.get(i).hienThiThongTin();
        }
    }

    // ham tim kiem thong tin
    public void timKiemThongTin() {
        // lay ra duoc nam hien tai
        Date now = new Date();
        int namHienTai = now.getYear();

        Nguoi[] danhSachThanhVien = null;

        for (HoDan hoDan : danhSachHoDan) {
            danhSachThanhVien = hoDan.getList();
            for (int i = 0; i < hoDan.getSoNguoi(); i++) {
                if ((namHienTai - (danhSachThanhVien[i].getNgaySinh().getYear()) == 80)) {
                    hoDan.hienThiThongTin();
                }
            }
        }
    }
}
