select HD.idHopDong,tienDatCoc,ngayLamHopDong,NV.hoTenNhanVien, KH.idKhachHang,hoTenKhachHang,sdtKhachHang,
DV.idDichVu,tenDichVu,sum(HDCT.soLuong) as soLuong
from hopdong HD
inner join khachhang KH on  HD.idKhachHang = KH.idKhachHang
inner join nhanvien NV on HD.idNhanVien = NV.idNhanVien
inner join dichvu DV on HD.idDichVu = DV.idDichVu
inner join hopdongchitiet HDCT on HD.idHopDong = HDCT.idHopDong
where HD.idDichVu not in (
select idDichVu
from hopdong
where ngayLamHopDong between '2019-01-01' and '2019-06-30'
) and HD.idDichVu in (
select HD.idDichVu
from hopdong
where ngayLamHopDong between '2019-10-01' and '2019-12-31'
) ;