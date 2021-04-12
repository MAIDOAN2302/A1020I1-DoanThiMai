
-- Yêu cầu 18: Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràng buộc giữa các bảng).

delete from khachhang KH
where KH.idKhachHang in (
select hopdong.idKhachHang
from hopdong
where year(ngayLamHopDong) <= 2016
);