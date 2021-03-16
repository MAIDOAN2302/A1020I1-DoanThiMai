package _00_bai_tap_them._02_quanly_canbo.test;

import _00_bai_tap_them._02_quanly_canbo.common.QLCB;

import java.util.Scanner;
/*
Đề bài: Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
• Mỗi cán bộ cần quản lý lý các thuộc tính: Họ tên, ngày sinh, giới tính, địa chỉ
• Các công nhân cần quản lý: Bậc (công nhân bậc 3/7, bậc 4/7 ...)
• Các kỹ sư cần quản lý: Ngành đào tạo
• Các nhân viên phục vụ cần quản lý thông tin: công việc
1. Xây dựng các lớp NhanVien, CongNhan, KySu kế thừa từ lớp CanBo
2. Xây dựng các hàm để truy nhập (get), thay đổi (set) và hiển thị thông tin về các thuộc tính của các lớp (nếu cần).
3. Xây dựng lớp QLCB cài đặt các phương thức thực hiện các chức năng sau:
• Nhập thông tin mới cho cán bộ
• Tìm kiếm theo họ tên
• Hiển thị thông tin cán bộ tìm được
 */

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        qlcb.nhapDanhSach(sc);

        System.out.println("Nhap vao ho ten can tim kiem: ");
        String name = sc.nextLine();

        qlcb.timKiemCanBo(name);
        //huy sc
        sc.close();

    }
}
