select HD.idHopDong,ngayLamHopDong,ngayKetThuc,tienDatCoc,count(HDCT.idHopDongChiTiet) as soDVDaSuDung
from hopdong HD
left join hopdongchitiet HDCT on HD.idHopDong = HDCT.idHopDong
left join dichvudikem DVDK on HDCT.idDichVuDiKem = DVDK.idDichVuDiKem
group by HD.idHopDong;