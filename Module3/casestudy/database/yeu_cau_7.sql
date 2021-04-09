select DV.idDichVu, tenDichVu, dienTich, soNguoiToiDa, chiPhiThue, LDV.tenLoaiDichVu
from dichvu DV
inner join hopdong HD on DV.idDichVu = HD.idDichVu
inner join loaidichvu LDV on DV.idLoaiDichVu = LDV.idLoaiDichVu
where HD.idDichVu not in (
select idDichVu
from hopdong
where year(ngayLamHopDong) = '2019'
) and HD.idDichVu in (select idDichVu
from hopdong
where year(ngayLamHopDong) = '2018') ;