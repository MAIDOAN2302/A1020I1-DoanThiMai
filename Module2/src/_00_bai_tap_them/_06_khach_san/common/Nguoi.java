package _00_bai_tap_them._06_khach_san.common;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Nguoi {
    // thuoc tinh
    protected String hoTen;
    private Date ngaySinh;
    protected int cmnd;

    //phuong thuc
    // ham khoi tao khong doi so
    public Nguoi(){
    }
    // ham khoi tao co doi so

    public Nguoi(String hoTen, Date ngaySinh, int cmnd) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.cmnd = cmnd;
    }
    // ham nhap
    public void nhapThongTin(Scanner sc){
        System.out.print("\tNhap ho ten: ");
        hoTen = sc.nextLine();

        System.out.print("\tNhap ngay sinh: ");
        String strDate = sc.nextLine();
        ngaySinh = strToDate(strDate);

        System.out.print("\tNhap vao cmnd: ");
        cmnd = sc.nextInt();
        sc.nextLine();
    }

    private Date strToDate(String strDate) {
        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyy");
        try {
            date = (Date) simpleDateFormat.parse(strDate);
        }catch (ParseException e){
            System.out.println("Loi dinh dang ngay thang: ");
        }return date;
    }
    //ham hien thi
    public void hienThiThongTin(){
        System.out.println("Ho ten : " +  hoTen);
        System.out.println("Ngay sinh : " +  ngaySinh);
        System.out.println("CMND : " +  cmnd);
    }
    private String dateToString(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String strDate = sdf.format(date);
        return strDate;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public int getCmnd() {
        return cmnd;
    }
}
