
-- Yêu cầu 18: Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràng buộc giữa các bảng).

-- delete hopdongchitiet,hopdong, khachhang
-- from hopdongchitiet
-- inner join hopdong  on hopdong.idHopDong = hopdongchitiet.idHopDong
-- inner join khachhang on hopdong.idKhachHang = khachhang.idKhachHang
-- where hopdong.idKhachHang not in(
-- select HD.idKhachHang
-- from hopdong HD
-- inner join khachhang KH on HD.idKhachHang = KH.idKhachHang
-- inner join hopdongchitiet HDCT on HD.idHopDong = HDCT.idHopDong
-- where year(ngayLamHopDong) > '2016' 
-- );
SET SQL_SAFE_UPDATES = 0;
delete from khachhang
where idKhachHang in (
select idKhachHang
from hopdong 
where year(ngayLamHopDong) <= 2016);
SET SQL_SAFE_UPDATES = 1;
