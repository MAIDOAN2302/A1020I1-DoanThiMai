drop database if exists products_managenment;
create database products_managenment;
use products_managenment;

create table products(
id int,
productCode varchar(10),
productName varchar(10),
productPrice double,
productAmount int,
productDescription text,
productStatus varchar(100)
);

insert into products
values
(1, 'A12', 'Coca', 5000, 100, 'Hàng Nhập', 'Đang giao'),
(2, 'B12', 'Pesi', 5000, 100, 'Hàng Nhập', 'Đang giao'),
(3, 'C12', 'Bia', 10000, 100, 'Hàng Nhập', 'Đang giao'),
(4, 'D12', 'Bò Húc', 7000, 100, 'Hàng Nhập', 'Đang giao'),
(5, 'E12', 'Rượu', 150000, 100, 'Hàng Nhập', 'Đang giao');

explain select *
from products
where productCode = 'E12' ; 

-- index
select * 
from products
where productCode = 'A12';

create unique index idx_product_code
on products (productCode);

create index idx_products_composite 
on products (productName,productPrice);

explain select *
 from products
 where productCode = 'A12';

-- View
create view view_products
as
select productName, productCode, productPrice, productStatus
from products;
select * from view_products;	

update view_products
set 
productName = 'Trà Bí Đao'
where productCode = 'A12';

select*from view_products ;

delete from view_products
where productCode= 'A12';
select*from view_products ;

drop view view_products;

-- SP
delimiter //

create procedure sp_products()
begin
select *from products ;
end;

// delimiter ;

call sp_products();

delimiter //
create procedure sp_products1
(id int,
productCode varchar(10),
productName varchar(10),
productPrice double,
productAmount int,
productDescription text,
productStatus varchar(100)
)
begin
	insert into products
    values
    (id, productCode,productName,productPrice, productAmount, productDescription,productStatus);
end;
// delimiter ;

call sp_products1(6,'T12','Rượu',7000, 100,'Hàng Nhập','Đang giao');

delimiter //
create procedure sp_products2
(in p_id int,
p_productCode varchar(10),
p_productName varchar(10),
p_productPrice double,
p_productAmount int,
p_productDescription text,
p_productStatus varchar(100)
)
begin
	update products
    set productCode = p_productCode, productName = p_productName,productPrice = p_productPrice, 
    productAmount = p_productAmount, productDescription = p_productDescription,productStatus = p_productStatus
    where id = p_id;
end;
// delimiter ;
call sp_products2(2,'ABC','Vang Nho', 200000, 50, 'Hang noi dia', 'Het Hang');

delimiter //
create procedure sp_delete(in p_id int)
begin
	delete from products 
    where id = p_id;
end;
// delimiter ;
call sp_delete(2);



