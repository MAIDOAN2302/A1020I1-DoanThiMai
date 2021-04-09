select distinct KH.hoTenKhachHang
from khachhang KH;

select hoTenKhachHang
from khachHang KH
group by KH.hoTenKhachHang;

select KH.hoTenKhachHang
from khachhang KH
left join loaikhach LK on KH.idLoaiKhachHang = LK.idLoaiKhachHang
union 
select KH.hoTenKhachHang
from khachhang KH
right join loaikhach LK on KH.idLoaiKhachHang = LK.idLoaiKhachHang;