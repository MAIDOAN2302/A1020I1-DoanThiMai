package _00_bai_tap_them._03_quanly_tailieu.test;

import _00_bai_tap_them._03_quanly_tailieu.common.QuanLySach;

import java.util.Scanner;
/*
Đề bài: Một thư viện cần quản lý các tài liệu bao gồm: Sách, Tạp chí, Báo
• Mỗi tài liệu có các thuộc tính: Mã tài liệu, Tên nhà xuất bản, Số bản phát hành.
• Các loại sách cần quản lý: Tên tác giả, số trang
• Các tạp chí cần quản lý: Số phát hành, tháng phát hành
• Các báo cần quản lý: ngày phát hành.
1. Xây dựng các lớp để quản lý các loại tài liệu trên sao cho việc sử dụng lại được nhiều nhất
2. Xây dựng lớp QuanLySach cài đặt các phương thức thực hiện các công việc sau:
• Nhập thông tin về các tài liệu
• Tìm kiếm tài liệu theo loại (sách, báo, tạp chí) hoặc theo mã tài liệu
Hiển thị thông tin tài liệu tìm kiếm được
 */

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLySach quanLySach = new QuanLySach();
        quanLySach.nhapDanhSachTaiLieu(sc);

        System.out.println("\n\nNhap vao loai tai lieu can tim: ");
        String loai = sc.nextLine();
        quanLySach.timKiemTheoLoaiTaiLieu(loai);

        System.out.println("\n\nNhap vao ma tai lieu can tim: ");
        String ma = sc.nextLine();
        quanLySach.timKiemTheoMaTaiLieu(ma);
    }
}
