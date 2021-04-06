drop database if exists luyen_tap_cac_ham_thong_dung;
create database luyen_tap_cac_ham_thong_dung;
use luyen_tap_cac_ham_thong_dung;

create table su_dung_ham
(id int ,
ten varchar(30),
tuoi int,
khoa_hoc varchar(15),
so_tien double
);

insert into su_dung_ham 
values
(1,'Hoang',21,'CNTT',400000),
(2,'Viet',19,'DTVT',320000),
(3,'Thanh',18,'KTDN',400000),
(4,'Nhan',19,'CK',450000),
(5,'Huong',20,'TCNH',500000),
(6,'Huong',20,'TCNH',200000);

select *from su_dung_ham
where ten = 'Huong';

select sum(so_tien) total
from su_dung_ham
where ten = 'Huong';

select distinct ten
from su_dung_ham;