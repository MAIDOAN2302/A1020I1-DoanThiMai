package _00_bai_tap_them._02_quanly_canbo.common;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    //thuoc tinh
    private ArrayList<CanBo> danhsachcanbo;

    //phuong thuc
    //ham khoi tao
    public QLCB() {
        danhsachcanbo = new ArrayList<CanBo>(10);
    }

    //ham them can bo
    public void themCanBo(CanBo cb) {
        danhsachcanbo.add(cb);
    }

    // ham nhap danh sach
    public void nhapDanhSach(Scanner sc) {
        CanBo cb;
        System.out.print("\tNhap so luong can bo: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhap thong tin chi tiet: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Lan nhap thu " + (i + 1) + ":");
            System.out.print("Chon can bo ( 1 - Ky su; 2 - Nhan vien; 3 - Cong nhan): ");
            int chon = sc.nextInt();
            sc.nextLine();

            cb = new CanBo();
            switch (chon) {
                case 1:
                    cb = new KySu();
                    break;
                case 2:
                    cb = new NhanVien();
                    break;
                case 3:
                    cb = new CongNhan();
                    break;
                default:
                    break;
            }
            // sau khi chon can bo can nhap, thi nhap thong tin cho can bo do
            cb.nhapThongTin(sc);
            // nhapxong roi thi them can bo vao danh sach
            themCanBo(cb);
        }
    }
    //ham tin kiem can bo theo ten
    public void timKiemCanBo(String hoTen){
        for (CanBo cb: danhsachcanbo){
            if (hoTen.equals(cb.getHoTen())){
                cb.hienThiThongTin();
            }
        }
    }
}
