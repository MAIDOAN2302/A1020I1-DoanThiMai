
-- Yêu cầu 14:  Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một
-- lần duy nhất. Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu,
-- TenDichVuDiKem, SoLanSuDung.

select HD.idHopDong, LDV.tenLoaiDichVu, DVDK.tenDichVuDiKem
from hopdong HD
left join dichvu DV on HD.idDichVu = DV.idDichVu
left join loaidichvu LDV on DV.idLoaiDichVu = LDV.idLoaiDichVu
left join hopdongchitiet HDCT on HD.idHopDong = HDCT.idHopDong
left join dichvudikem DVDK on HDCT.idDichVuDiKem = DVDK.idDichVuDiKem
where HDCT.soLuong = 1;