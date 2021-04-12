-- Yêu cầu 13: Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các
-- Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử
-- dụng nhiều như nhau).

select HDCT.idDichVuDiKem,tenDichVuDiKem,max(HDCT.soLuong)
from dichvudikem DVDK
inner join hopdongchitiet HDCT on DVDK.idDichVuDiKem = HDCT.idDichVuDiKem
group by HDCT.idDichVuDiKem
order by soLuong desc
limit 3;	
