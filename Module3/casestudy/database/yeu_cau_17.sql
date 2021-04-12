update khachhang
inner join hopdong on khachhang.idKhachHang = hopdong.idKhachHang
set khachhang.idLoaiKhachHang = 1
where ( khachhang.idLoaiKhachHang = 4) and (year(ngayLamHopDong) = 2019) and (hopdong.tongTien >=2000) ;