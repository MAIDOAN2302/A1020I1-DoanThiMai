
-- Yêu cầu 19: Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.
update dichvudikem
inner join hopdongchitiet  on hopdongchitiet.idDichVuDiKem = dichvudikem.idDichVuDiKem
set gia = gia*2
where dichvudikem.idDichVuDiKem in (
	select * from(
		select dichvudikem.idDichVuDiKem
        from dichvudikem 
		inner join hopdongchitiet  on hopdongchitiet.idDichVuDiKem = dichvudikem.idDichVuDiKem
		inner join hopdong  on hopdongchitiet.idHopDong = hopdong.idHopDong
		where year(hopdong.ngayLamHopDong) = '2019') as temp 
	group by dichvudikem.idDichVuDiKem
	having count(hopdongchitiet.idDichVuDiKem) >= 2);

