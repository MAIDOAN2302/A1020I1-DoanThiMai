select DV.idDichVu,tenDichVu,dienTich,chiPhiThue, LDV.tenLoaiDichVu, HD.ngayLamHopDong
from dichvu DV
inner join loaidichvu LDV on DV.idLoaiDichVu = LDV.idLoaiDichVu
inner join hopdong HD on DV.idDichVu =  HD.idDichVu
where  ngayLamHopDong not in(
select ngayLamHopDong
from hopdong
where ngayLamHopDong between '2019-01-01' and '2019-03-31'
);
