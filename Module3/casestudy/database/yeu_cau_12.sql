-- Yêu cầu 12: Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang,
-- SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (được
-- tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ
-- đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa
-- từng được khách hàng đặt vào 6 tháng đầu năm 2019.

select HD.idHopDong,tienDatCoc,ngayLamHopDong,NV.hoTenNhanVien, KH.idKhachHang,hoTenKhachHang,sdtKhachHang,
DV.idDichVu,tenDichVu,sum(HDCT.soLuong) as soLuong
from hopdong HD
inner join khachhang KH on  HD.idKhachHang = KH.idKhachHang
inner join nhanvien NV on HD.idNhanVien = NV.idNhanVien
inner join dichvu DV on HD.idDichVu = DV.idDichVu
inner join hopdongchitiet HDCT on HD.idHopDong = HDCT.idHopDong
where HD.idHopDong in(
select idHopDong
from hopdong
where ngayLamHopDong between '2019-10-01' and '2019-12-31');


