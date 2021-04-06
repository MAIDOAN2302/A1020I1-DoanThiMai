select KH.idKhachHang,hoTenKhachHang, HD.idHopDong,ngayLamHopDong,ngayKetThuc,LK.idLoaiKhachHang,tenLoaiKhachHang
from hopdong HD
inner join khachhang KH on HD.idHopDong = KH.idHopDong
right join loaikhach LK on KH.idLoaiKhachHang = LK.idLoaiKhachHang;

