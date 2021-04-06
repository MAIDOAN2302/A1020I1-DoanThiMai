-- 1. Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.

select*from nhanVien
where (hoTenNhanVien like 'T%' or hoTenNhanVien like 'H%' or hoTenNhanVien like 'K%' ) and char_length(hoTenNhanVien)<15;

