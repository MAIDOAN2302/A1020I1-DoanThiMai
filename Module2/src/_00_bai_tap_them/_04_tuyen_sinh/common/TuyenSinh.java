package _00_bai_tap_them._04_tuyen_sinh.common;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    // thuoc tinh
    private ArrayList<ThiSinh> danhSachThiSinh;
    //phuong thuc
    // ham khoi tao
    public TuyenSinh(){
        danhSachThiSinh = new ArrayList<ThiSinh>(10);
    }
    //ham them mot thi sinh
    public void themThiSinh(ThiSinh ts){
        danhSachThiSinh.add(ts);
    }
    // ham nhap danh sach
    public void nhapDanhSach(Scanner sc){
        ThiSinh ts;
        int chon;

        System.out.print("Nhap vao so luong thi sinh: ");
        int n  = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n ; i ++){
            System.out.print("Thi sinh thuoc khoi nao (1 - KhoiA, 2 - KhoiB, 3 - KhoiC) : ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon){
                case 1:
                    ts = new KhoiA("Toan", "Ly","Hoa");
                    break;
                case 2:
                    ts = new KhoiB("Toan","Hoa","Sinh");
                    break;
                case 3:
                    ts = new KhoiC("Van", "Su","Dia");
                    break;
                default:
                    ts = new KhoiA("Toan", "Ly","Hoa");
                    break;
            }
            ts.nhapThongTin(sc);
            themThiSinh(ts);
        }
    }
    // ham hien thi toan bo danh sach
    public void hienThiDanhSach(){
        int n = danhSachThiSinh.size();
        for (int i = 0; i < n; i++){
            System.out.println("Thi sinh thu " + (i + 1) + "la: ");
            danhSachThiSinh.get(i).hienThiThongTin();
        }
    }
    // ham tim kiem thi sinh theo so bao danh
    public void timKiemTheoSBD(int soBaoDanh){
        for (ThiSinh ts: danhSachThiSinh){
            if (ts.getSoBD() == soBaoDanh){
                ts.hienThiThongTin();
            }
        }
    }

}
