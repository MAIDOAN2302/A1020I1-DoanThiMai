select DVDK.idDichVuDiKem,tenDichVuDiKem,gia,donVi,trangThaiKhaDung
from khachhang KH 
inner join hopdong HD on KH.idKhachHang = HD.idKhachHang
inner join hopdongchitiet HDCT on HD.idHopDong = HDCT.idHopDong
inner join dichvudikem DVDK on HDCT.idDichVuDiKem = DVDK.idDichVuDiKem
where KH.diaChiKhachHang = 'Quảng Ngãi' or KH.diaChiKhachHang = 'Vinh';