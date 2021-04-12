
-- Yêu cầu 15: Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen,
-- TrinhDo, TenBoPhan, SoDienThoai, DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.

select NV.idNhanVien,hoTenNhanVien,sdtNhanVien,diaChiNhanVien, TD.trinhDo, BP.tenBoPhan,count(hopdong.idHopDong) soLanLapHD
from hopdong 
inner join nhanvien NV on hopdong.idNhanVien = NV.idNhanVien
inner join trinhdo TD on NV.idTrinhDo = TD.idTrinhDo
inner join bophan BP on NV.idBoPhan = BP.idBoPhan
where year(ngayLamHopDong) between 2018 and 2019
group by hopdong.idNhanVien
having soLanLapHD = 3;
