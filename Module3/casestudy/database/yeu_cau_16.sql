-- Yêu cầu 16:  Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
SET SQL_SAFE_UPDATES = 0;
delete from nhanvien NV
where NV.idNhanVien not in (
select hopdong.idNhanVien
from hopdong
where year(ngayLamHopDong) between 2017 and 2019
);
SET SQL_SAFE_UPDATES = 1;