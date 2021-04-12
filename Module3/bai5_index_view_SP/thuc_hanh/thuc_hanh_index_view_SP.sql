-- 1 Index
use customer_management;
select*
from customer
where customer_name = 'Hoà';

create index idx_customer_name
on customer (customer_name);

-- View
 use furumahotel;
 create view view_NhanVien_and_KhachHang
 as
 select idNhanVien Id, hoTenNhanVien `name`, ngaySinh NgaySing, 0 'Type_person'
 from nhanvien
 union all
 select idKhachHang Id, hoTenKhachHang `name`, ngaySinhKhachHang NgaySing, 1 'Type_person'
 from khachhang;
 
 select * from view_nhanvien_and_khachhang;
 
 -- 3 SP
 -- Tham trị

delimiter //
create procedure sp_find_by_name (in p_keyword varchar(10))

begin

	select *

    from khachhang

    where hoTenKhachHang like concat('%', p_keyword, '%');

end;

// delimiter ;

-- Tham chiếu
delimiter //
create procedure sp_find_by_name_inout (inout p_keyword varchar(10))
begin
	
    set p_keyword = (
		select count(*)
        from khachhang 
        where hoTenKhachHang like concat('%', p_keyword, '%'));
end;
// delimiter ;

set @keyword_result = 'Hoàng';
call sp_find_by_name_inout (@keyword_result );
select @keyword_result ;

-- out
delimiter //
create procedure sp_find_by_name_out (p_keyword varchar(10), out p_result int)
begin 
	set p_result = (
		select count(*)
        from khachhang
        where hoTenKhachHang like concat('%', p_keyword, '%')
        );
end;
// delimiter ;

call sp_find_by_name_out ('i', @result);
select @result;


        