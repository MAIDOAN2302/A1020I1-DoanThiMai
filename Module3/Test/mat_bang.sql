drop database if exists mat_bang;
create database mat_bang;
use mat_bang;

create table loai_VP(
id int not null primary key,
hinh_thuc_VP varchar(255) not null
);

insert into loai_VP
values
(1,'Chia sẻ'),
(2,'Trọn gói');

create table mat_bang(
ma_mat_bang varchar(25) primary key not null,
dien_tich double not null,
trang_thai varchar(255),
tang int not null,
id_loai_VP int,
mo_ta_chi_tiet varchar(255),
gia_cho_thue double not null,
ngay_bat_dau date not null,
ngay_ket_thuc date not null,

foreign key(id_loai_VP) references loai_VP(id)
);

insert into mat_bang
values
('MBT-01-TT',25,'Trống',2,1,'Nằm ở Trung tâm TP',5000000,'2021-01-15','2021-06-23'),
('MBT-02-TT',26,'Trống',3,2,'Nằm trên đường Bạch Đằng',5000000,'2021-01-15','2021-06-23'),
('MBT-03-TT',26,'Trống',3,2,'Nằm trên đường Bạch Đằng',5000000,'2021-01-15','2021-06-23'),
('MBT-04-TT',26,'Trống',3,2,'Nằm trên đường Bạch Đằng',5000000,'2021-01-15','2021-06-23'),
('MBT-05-TT',26,'Trống',3,2,'Nằm trên đường Bạch Đằng',5000000,'2021-01-15','2021-06-23'),
('MBT-06-TT',26,'Trống',3,2,'Nằm trên đường Bạch Đằng',5000000,'2021-01-15','2021-06-23'),
('MBT-07-TT',26,'Trống',3,2,'Nằm trên đường Bạch Đằng',5000000,'2021-01-15','2021-06-23'),
('MBT-08-TT',26,'Trống',3,2,'Nằm trên đường Bạch Đằng',5000000,'2021-01-15','2021-06-23');


