-- Yêu cầu 20: Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị 
-- bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.

select idNhanVien ID,hoTenNhanVien HoTen,emailNhanVien Email, sdtNhanVien Phone, ngaySinh NgaySinh, diaChiNhanVien DiaChi
from nhanvien
union all
select idKhachHang ID,hoTenKhachHang HoTen,emailKhachHang Email, sdtKhachHang Phone, ngaySinhKhachHang NgaySinh, diaChiKhachHang DiaChi
from khachhang