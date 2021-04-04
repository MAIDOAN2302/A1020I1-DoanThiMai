drop database truyVanDuLieuNangCao;
create database truyVanDuLieuNangCao;
use truyVanDuLieuNangCao;

create table productlines(
productline varchar(30),
textDescription text,
htmlDescription text,
image text
);

insert into productlines
value 
('subaru', 'dòng mới năm 2021', 'impreza','abc'),
('honda', 'dòng mới năm 2021', 'hondaBRS','cbd'),
('matsuda', 'dòng mới năm 2021', 'matsuda8','uiop');

select * from productlines;

create table producs(
productCode int,
productName varchar(30),
productline varchar(30),
productScale varchar(30),
productVendor varchar(30),
productDescription text,
quantilyStock int,
buyPrice double,
MSRP int
);

insert into producs
value
(1,'vison','subaru', '50 phân khôi', 'Tiến Thu', 'dòng mói có bổ sung chống sốc', 100, 35000, 1),
(2,'AB',' honda', '50 phân khôi', 'Tiến Thu', 'dòng mói có bổ sung chống sốc', 100, 55000, 2),
(3,'Dream','matsuda', '50 phân khôi', 'Tiến Thu', 'dòng mói có bổ sung chống sốc', 100, 15000, 3);
 select productCode,productName,buyPrice,quantilyStock
 from producs 
 where buyPrice >56.76 and quantilyStock >10; 	
 
 select  productCode,productName,buyPrice,textDescription
 from producs
 inner join productlines
 on producs.productline = productlines.productline
 where buyPrice > 15000 and buyPrice < 55000;