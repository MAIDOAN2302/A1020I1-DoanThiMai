select KH.idKhachHang,hoTenKhachHang, HD.idHopDong,ngayLamHopDong,ngayKetThuc, LK.tenLoaiKhachHang, DV.tenDichVu,
(chiPhiThue + (soLuong*gia)) as Total
from khachhang KH
left join hopdong HD on KH.idKhachHang = HD.idKhachHang
left join loaikhach LK on KH.idLoaiKhachHang = LK.idLoaiKhachHang
left join dichvu DV on HD.idDichVu = DV.idDichVu
left join hopdongchitiet HDCT on HD.idHopDong = HDCT.idHopDong
left join dichvudikem DVDK on HDCT.idDichVuDiKem = DVDK.idDichVuDiKem
group by KH.idKhachHang;


