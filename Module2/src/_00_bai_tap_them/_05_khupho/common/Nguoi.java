package _00_bai_tap_them._05_khupho.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    // thuoc tinh
    private String hoTen;
    private Date ngaySinh;
    private String ngheNghiep;

    //phuong thuc
    //ham khoi tao khong doi so
    public Nguoi() {

    }
    //ham khoi tao co doi so

    public Nguoi(String hoTen, Date ngaySinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.ngheNghiep = ngheNghiep;
    }

    //ham nhap
    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        String strDate = sc.nextLine();
        ngaySinh = strToDate(strDate);
        System.out.print("\tNhap nghe nghiep: ");
        ngheNghiep = sc.nextLine();
    }

    // ham nay thuc hien chuyen dinh dang String sang Date
    private Date strToDate(String strDate) {
        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = simpleDateFormat.parse(strDate);
        } catch (ParseException e) {
            System.out.println("Loi dinh dang ngay thang!");
        }
        return date;
    }

    // ham hien thi thong tin
    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen);
        System.out.println("\tNgay sinh: " + dateToString(ngaySinh));
        System.out.println("\tNghe nghiep: " + ngheNghiep);
    }

    private String dateToString(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String strDate = simpleDateFormat.format(date);

        return strDate;
    }
    // ham lay thong tin ve ngay sinh

    public Date getNgaySinh() {
        return ngaySinh;
    }
}
