select KH.hoTenKhachHang, LK.tenLoaiKhachHang, count(HD.idKhachHang) so_lan_dat
from khachhang KH
inner join hopdong HD on HD.idKhachHang = KH.idKhachHang
inner join loaikhach LK on LK.idLoaiKhachHang = KH.idLoaiKhachHang
where tenLoaiKhachHang = 'Diamond'
group by KH.idKhachHang;