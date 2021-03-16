package _00_bai_tap_them._04_tuyen_sinh.test;

import _00_bai_tap_them._04_tuyen_sinh.common.TuyenSinh;

import java.util.Scanner;
/*
Đề bài: Các thí sinh dự thi đại học bao gồm các thí sinh thi khối A, thí sinh thi khối B, thí sinh thi khối C
• Các thí sinh cần quản lý các thuộc tính: Số báo danh, họ tên, địa chỉ, diện ưu tiên khu vực.
• Thí sinh thi khối A thi các môn: Toán, lý, hoá
• Thí sinh thi khối B thi các môn: Toán, Hoá, Sinh
• Thí sinh thi khối C thi các môn: Văn, Sử, Địa
1. Xây dựng các lớp để quản lý các thí sinh sao cho sử dụng lại được nhiều nhất.
2. Xây dựng lớp TuyenSinh cài đặt các phương thức thực hiện các nhiệm vụ sau:
• Nhập thông tin về các thí sinh dự thi
• Hiển thị thông tin về một thí sinh
• Tìm kiếm theo số báo danh
 */

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh dsTuyenSinh = new TuyenSinh();

        System.out.println("Nhap vao danh sach thi sinh: ");
        dsTuyenSinh.nhapDanhSach(sc);

        System.out.print("Danh sach thi sinh du thi la: ");
        dsTuyenSinh.hienThiDanhSach();

        System.out.print("Nhap so bao danh can tim: ");
        int soBaoDanh = sc.nextInt();
        sc.nextLine();
        dsTuyenSinh.timKiemTheoSBD(soBaoDanh);

        sc.close();
    }
}
