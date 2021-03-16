package _00_bai_tap_them._01_phan_so.common;

import java.util.Scanner;
/*
Đề bài: Xây dựng lớp phân số với hai thuộc tính riêng xác định tử số và mẫu số của phân số và xây dựng các phương thức:
• Các hàm khởi tạo (constructor) trong trường hợp không có tham số và trường hợp có 2 tham số tử số và mẫu số
• Các hàm thực hiện phép toán cộng, trừ, nhân, chia các phân số
• Hàm thực hiện kiểm tra một phân số có phải tối giản hay không
• Hàm tìm tìm dạng tối giản của phân số
• Hàm tìm ước số chung lớn nhất của 2 số nguyên.
Viết chương trình ứng dụng, trong đó khai báo 3 đối số phân số là sp1, sp2 và spTong để tương tác với
các hàm có trong lớp phân số trên.
 */

public class PhanSo {
    // thuoc tinh
    private int tuSo;
    private int mauSo;

    // phuong thuc
    // ham khoi tao khong doi so
    public PhanSo(){
        tuSo = 0;
        mauSo = 1;
    }
    // ham khoi tao co doi so
    public PhanSo(int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    //ham nhap phan so
    public void nhapPS(Scanner sc){
        int a;
        int b;
        do {
            System.out.print("\tNhap vao tu so: ");
            a = sc.nextInt();
            System.out.print("\tNhap vao mau so: ");
            b = sc.nextInt();
            // kiem tra
            if (b==0){
                System.out.println("Mau so khong duoc bang 0! Hay nhap lai!");
            }else {
                tuSo = a;
                mauSo = b;
            }
        }while (b==0);
    }
    //ham hien thi
    public void hienThiPS(){
        if (tuSo*mauSo < 0 ){
            System.out.println("\t-" + Math.abs(tuSo) + "/" +Math.abs(mauSo));
        }else {
            System.out.println("\t" + Math.abs(tuSo) + "/" +Math.abs(mauSo));
        }
    }
    //ham cong hai so chia a/b + a1/b1
    public PhanSo congPS(PhanSo ps2){
       int a = tuSo*ps2.mauSo + ps2.tuSo*mauSo;
       int b = mauSo*ps2.mauSo;

       return new PhanSo(a,b);
    }
    //ham tru hai so chia a/b - a1/b1
    public PhanSo truPS(PhanSo ps2){
        int a = tuSo*ps2.mauSo - mauSo*ps2.tuSo;
        int b = mauSo*ps2.mauSo;

        return new PhanSo(a,b);
    }
    //ham nhan hai so chia a/b * a1/b1
    public PhanSo nhanPS (PhanSo ps2){
        int a = tuSo*ps2.tuSo;
        int b = mauSo*ps2.mauSo;

        return new PhanSo(a,b);
    }
    //ham chia hai so chia a/b / a1/b1
    public PhanSo chiaPS (PhanSo ps2){
        int a = tuSo*ps2.mauSo;
        int b = mauSo*ps2.tuSo;

        return new PhanSo(a,b);
    }
    //ham tim USCLN
    private int timUSCLN(int a, int b){
        int r = a%b;

        while (r != 0){
            a = b;
            b = r;
            r = a%b;
        }
        return b;
    }
    // ham kiem tra phan so co toi gian hay chua
    public boolean kiemTraPSToiGian(){
        if (timUSCLN(tuSo,mauSo)  == 1){
            return true;
        }else {
            return false;
        }
    }
    //ham lam cho phan so toi gian
    public void toiGianPhanSo(){
        int x = timUSCLN(tuSo,mauSo);

        tuSo/=x;
        mauSo/=x;
    }
}
