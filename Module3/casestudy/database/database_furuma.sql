drop database furumaHotel;
create database furumaHotel;
use furumaHotel;

create table hopDong(
idHopDong int not null primary key ,
idNhanVien int not null,
idKhachHang int not null,
ngayLamHopDong date not null,
ngayKetThuc date not null,
tienDatCoc double,
tongTien double not null
);
insert into hopDong
value
(1,1,1,'2021-03-31','2021-04-21',500,2000),
(2,2,2,'2021-03-31','2021-04-21',500,2000),
(3,3,3,'2021-03-31','2021-04-21',500,2000),
(4,4,4,'2021-03-31','2021-04-21',500,2000),
(5,5,6,'2021-03-31','2021-04-21',500,2000);

create table nhanVien(
idNhanVien int not null  ,
hoTenNhanVien varchar (50) not null,
idViTriNhanVien int not null,
idTrinhDo int not null,
idBoPhan int not null,
ngaySinh date not null,
soCMND varchar(9) not null,
luongNhanVien double not null,
sdtNhanVien varchar(45) not null,
emailNhanVien varchar (45) not null,
diaChiNhanVien varchar(45) not null,
idHopDong int not null ,

primary key(idNhanVien),

constraint nhanVienTrongHopDong foreign key (idHopDong) references hopDong(idHopDong)

);

insert into nhanVien
value
(1,'Đoàn Thị Điểm', 1, 1, 1, '2021-03-31', '2055181', 5000, '090512345', 'abc@123.com','Hà Nội',1),
(2,'Lê Thánh Tông', 2, 2, 2, '2021-03-31', '205518', 5000, '090512343', 'bcd@123.com','Hà Nội',2),
(3,'Hồ Quý Ly', 3, 3, 3, '2021-03-31', '205518', 5000, '090512344', 'dfr@123.com','Hà Nội',3),
(4,'Trần Địa Lô', 4, 4, 4, '2021-03-31', '2055181', 5000, '090512346', 'rty@123.com','Hà Nội',4),
(5,'Trần Hưng Đạo', 5, 5, 5, '2021-03-31', '205518157', 5000,'09768231', 'hjk@123.com','Hà Nội',5);

select*from nhanVien
where hoTenNhanVien like 'T%' or hoTenNhanVien like 'H%' or hoTenNhanVien like 'K%' ;


create table viTri(
idViTri int not null,
tenViTri varchar(45) not null,
idNhanVien int not null,

constraint viTriCuaNhanVien foreign key (idNhanVien) references nhanVien (idNhanVien)
);

insert into viTri
value
(1,'staff',1),
(2,'staff',2),
(3,'staff',3),
(4,'staff',4),
(5,'staff',5);

create table trinhDo(
idTrinhDo int not null,
trinhDo varchar(45) not null,
idNhanVien int not null,

constraint trinhDoCuaNhanVien foreign key (idNhanVien) references nhanVien (idNhanVien)
);

insert into trinhDo
value
(1,'Đại Học', 1),
(2,'Đại Học', 2),
(3,'Đại Học', 3),
(4,'Đại Học', 4),
(5,'Đại Học', 5);

create table boPhan(
idBoPhan int not null,
tenBoPhan varchar(45) not null,
idNhanVien int not null,

constraint nhanVienThuocBoPhan foreign key (idNhanVien) references nhanVien (idNhanVien)
);

insert into boPhan
value
(1,'Sale',1),
(2,'Sale',2),
(3,'Sale',3),
(4,'Sale',4),
(5,'Sale',5);

create table khachHang(
idKhachHang int not null ,
idLoaiKhachHang int not null primary key,
hoTenKhachHang varchar(50),
ngaySinhKhachHang date not null,
soCMND varchar(9) not null,
emailKhachHang varchar (45) not null,
diaChiKhachHang varchar(45) not null,
idHopDong int not null ,

constraint khachHangTrongHopDong foreign key (idHopDong) references hopDong (idHopDong)
);

insert into khachHang
value
(1,1,'Nguyễn Văn Trỗi', '1992-03-31', '12345689','123@123','Quảng Nam',1),
(2,2,'Võ Văn Tần', '1986-03-31', '12345678','123@abc','Đà Nẵng',2),
(3,3,'Huỳnh Thân', '1965-03-31', '123456784','123@dgh','Hà Nội',3),
(4,4,'Đỗ Hoàng', '2021-03-31', '12345677','123@rty','Quảng Bình',4),
(5,5,'Mai Huyền Trân', '2005-03-31', '12356781','123@hjj','Đà Nẵng',5);

select * from khachHang
where diaChiKhachHang in ('Quảng Nam','Đà Nẵng');





create table loaiKhach(
tenLoaiKhachHang varchar(45),
idLoaiKhachHang int not null ,
constraint loaiKhachHang foreign key (idLoaiKhachHang) references khachHang(idLoaiKhachHang)
);

insert into loaiKhach
value
('Diamond',1),
('VIP',2),
('Diamond',3),
('Normal',4),
('VIP',5);

create table hopDongChiTiet(
idHopDongChiTiet int not null primary key,
idDichVuDiKem int not null,
soLuong int not null,
idHopDong int not null,

constraint idHopDongTrongHopDongChiTiet foreign key(idHopDong) references hopDong(idHopDong)
);

insert into hopDongChiTiet
value
(1,1,1,1),
(2,2,2,2),
(3,3,3,3),
(4,4,4,4),
(5,5,5,5);

create table dichVuDiKem(
idDichVuDiKem int not null,
tenDichVuDiKem varchar(45) not null,
gia double not null,
donVi varchar(45) not null,
trangThaiKhaDung text not null,
idHopDongChiTiet int not null ,

constraint dichVuDiKemTrongHopDongChiTiet foreign key(idHopDongChiTiet) references hopDongChiTiet(idHopDongChiTiet)
);

insert into dichVuDiKem
value
(1,'Ăn Sáng',200,'VND','Còn chỗ',1),
(2,'Ăn Sáng',200,'VND','Còn chỗ',2),
(3,'Ăn Sáng',200,'VND','Còn chỗ',3),
(4,'Ăn Sáng',200,'VND','Còn chỗ',4),
(5,'Ăn Sáng',200,'VND','Còn chỗ',5);

create table dichVu(
idDichVu int not null primary key,
tenDichVu varchar(45) not null,
dienTich double not null,
soTang int not null,
soNguoiToiDa int not null,
chiPhiThue double not null,
idKieuThue int not null,
idLoaiDichVu int not null,
trangThai text not null,
idHopDong int not null,

constraint dichVuTrongHopDong foreign key (idHopDong) references hopDong(idHopDong)
);

insert into dichVu
value
(1,'Vip',20,1,1,1000,1,1,'Còn phòng',1),
(2,'Vip',20,2,2,1000,2,2,'Còn phòng',2),
(3,'Vip',20,3,3,1000,3,3,'Còn phòng',3),
(4,'Vip',20,4,4,1000,4,4,'Còn phòng',4),
(5,'Vip',20,5,5,1000,5,5,'Còn phòng',5);

create table kieuThue(
idKieuThue int ,
tenKieuThue varchar(45),
gia double not null,
idDichVu int not null,

constraint kieuThueCuaDichVu foreign key (idDichVu) references dichVu(idDichVu)
);

insert into kieuThue
value
(1,'Ngắn hạn',1000,1),
(2,'Ngắn hạn',1000,2),
(3,'Ngắn hạn',1000,3),
(4,'Ngắn hạn',1000,4),
(5,'Ngắn hạn',1000,5);

create table loaiDichVu(
idLoaiDichVu int not null,
tenLoaiDichVu varchar (45) not null,
idDichVu int not null,

constraint loaiDichVu foreign key (idDichVu) references dichVu(idDichVu)
);

insert into loaiDichVu
value
(1,'Vip',1),
(2,'Vip',2),
(3,'Vip',3),
(4,'Vip',4),
(5,'Vip',5);
