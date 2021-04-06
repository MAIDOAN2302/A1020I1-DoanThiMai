
-- Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và
-- có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.

select *,year(ngaySinhKhachHang), (year(now()) - year(ngaySinhKhachHang)) as tuoi
from khachHang
where (diaChiKhachHang in ('Quảng Nam','Đà Nẵng')) having (tuoi between 18 and 50 );