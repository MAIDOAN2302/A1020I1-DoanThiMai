package _00_bai_tap_them._03_quanly_tailieu.common;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    // thuoc tinh
    private ArrayList<TaiLieu> danhsachTaiLieu;

    // phuong thuc
    // ham khoi tao
    public QuanLySach() {
        danhsachTaiLieu = new ArrayList<TaiLieu>(10);
    }

    // ham them moi 1 tai lieu
    public void themTaiLieu(TaiLieu tl) {
        danhsachTaiLieu.add(tl);
    }

    // nhap danh sach tai lieu
    public void nhapDanhSachTaiLieu(Scanner sc) {
        int chon;
        String stop;
        TaiLieu tl = null;
        do {
            System.out.print("Chon loai tai lieu (1 - Sach, 2 - Tap chi, 3 - Bao): ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    tl = new Sach();
                    break;
                case 2:
                    tl = new TapChi();
                    break;
                case 3:
                    tl = new Bao();
                    break;
                default:
                    break;
            }
            tl.nhapThongTin(sc);
            themTaiLieu(tl);
            System.out.println("\nBan co muon nhap vao nua hay khong (c/k)?");
            stop = sc.nextLine();
        } while (stop.equals("c"));
    }

    // ham tim kiem theo ma tai lieu
    public void timKiemTheoMaTaiLieu(String mTL) {
        for (TaiLieu tl : danhsachTaiLieu) {
            if (mTL.equals(tl.getMaTaiLieu())) {
                tl.hienThiThongTin();
            }
        }
    }

    //ham tim kiem theo loai tai lieu
    public void timKiemTheoLoaiTaiLieu(String loaiTL) {
        for (TaiLieu tl : danhsachTaiLieu) {
            if (loaiTL.equals("Sach") && (tl instanceof Sach)) {
                tl.hienThiThongTin();
            } else if (loaiTL.equals("Tap chi") && (tl instanceof TapChi)) {
                tl.hienThiThongTin();
            } else if (loaiTL.equals("Bao") && (tl instanceof Bao)) {
                tl.hienThiThongTin();
            }

        }
    }
}
