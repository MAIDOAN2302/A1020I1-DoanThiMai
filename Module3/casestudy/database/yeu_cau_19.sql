
-- Yêu cầu 19: Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.
update dichvudikem DVDK
inner join hopdongchitiet HDCT on DVDK.idDichVuDiKem = HDCT.idDichVuDiKem
inner join hopdong HD on HDCT.idHopDong = HD.idHopDong
set gia = gia*2
where sum(HDCT.soLuong) = 10;