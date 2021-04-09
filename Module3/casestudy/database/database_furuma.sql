drop database if exists furumaHotel ;
create database furumaHotel;
use furumaHotel;

create table viTri(
idViTri int not null primary key,
tenViTri varchar(45) not null
);

insert into viTri
values
(1,'staff'),
(2,'Manager'),
(3,'Chief'),
(4,'Security'),
(5,'Lao cong');

create table trinhDo(
idTrinhDo int not null primary key,
trinhDo varchar(45) not null
);

insert into trinhDo
value
(1,'Đại Học'),
(2,'Cao Đẳng'),
(3,'Trung Cấp');

create table boPhan(
idBoPhan int not null primary key,
tenBoPhan varchar(45) not null
);

insert into boPhan
values
(1,'Sale'),
(2,'Marketing'),
(3,'Kế Toán'),
(4,'Quản lý'),
(5,'Nhân sự');

create table nhanVien(
idNhanVien int not null primary key ,
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

foreign key (idViTriNhanVien) references viTri(idViTri),
foreign key (idTrinhDo) references trinhDo (idTrinhDo),
foreign key (idBoPhan) references boPhan(idBoPhan)
);

insert into nhanVien
values
(1,'Đoàn Thị Điểm', 1, 1, 1, '2021-03-31', '2055181', 5000, '090512345', 'abc@123.com','Hà Nội'),
(2,'Lê Thánh Tông', 2, 2, 2, '2021-03-31', '205518', 5000, '090512343', 'bcd@123.com','Hà Nội'),
(3,'Hồ Quý Ly', 3, 3, 3, '2021-03-31', '205518', 5000, '090512344', 'dfr@123.com','Hà Nội'),
(4,'Trần Địa Lô', 4, 1, 4, '2021-03-31', '2055181', 5000, '090512346', 'rty@123.com','Hà Nội'),
(5,'Trần Hưng Đạo', 5, 2, 5, '2021-03-31', '205518157', 5000,'09768231', 'hjk@123.com','Hà Nội');

create table loaiKhach(
idLoaiKhachHang int not null  primary key,
tenLoaiKhachHang varchar(45)
);

insert into loaiKhach
values
(1,'Diamond'),
(2,'VIP'),
(3,'Normal');

create table khachHang(
idKhachHang int not null primary key ,
idLoaiKhachHang int not null ,
hoTenKhachHang varchar(50),
ngaySinhKhachHang date not null,
soCMND varchar(9) not null,
sdtKhachHang varchar(45) not null,
emailKhachHang varchar (45) not null,
diaChiKhachHang varchar(45) not null,

foreign key (idLoaiKhachHang) references loaiKhach (idLoaiKhachHang)
);

insert into khachHang
values
(1,1,'Nguyễn Văn Trỗi', '1992-03-31', '12345689','091786565','123@123','Quảng Nam'),
(2,2,'Nguyễn Văn Trỗi', '1992-03-31', '12345689','091056565','123@123','Quảng Nam'),
(3,3,'Võ Văn Tần', '1986-03-31', '12345678','097896565','123@abc','Đà Nẵng'),
(4,1,'Võ Văn Tần', '1965-03-31', '123456784','091786123','123@dgh','Vinh'),
(5,2,'Đỗ Hoàng', '2021-03-31', '12345677','0910598565','123@rty','Quảng Ngãi'),
(6,3,'Mai Huyền Trân', '1992-03-31', '12356781','0911598565','123@hjj','Đà Nẵng'),
(8,1,'Trần Văn Cường', '1992-03-31', '12356781','091159565','123@hjj','Đà Nẵng');

create table kieuThue(
idKieuThue int not null primary key ,
tenKieuThue varchar(45),
gia double not null
);

insert into kieuThue
values
(1,'Thuê ngắn hạn',1000),
(2,'Thuê trung hạn',1000),
(3,'Thuê dài hạn',1000);

create table loaiDichVu(
idLoaiDichVu int not null primary key,
tenLoaiDichVu varchar (45) not null
);

insert into loaiDichVu
values
(1,'Trọn gói'),
(2,'Riêng lẽ'),
(3,'Combo tuỳ chọn');


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

foreign key(idKieuThue) references kieuThue(idKieuThue),
foreign key (idLoaiDichVu) references loaiDichVu(idLoaiDichVu)
);

insert into dichVu
values
(1,'Villa',100,6,100,2000000,1,1,'Còn phòng'),
(2,'House',50,3,10,1000000,2,2,'Còn phòng'),
(3,'Room',20,2,3,500000,3,3,'Còn phòng');

create table hopDong(
idHopDong int not null primary key ,
idNhanVien int not null,
idKhachHang int not null,
idDichVu int not null,
ngayLamHopDong date not null,
ngayKetThuc date not null,
tienDatCoc double,
tongTien double not null,

foreign key (idDichVu) references dichVu(idDichVu),
foreign key (idKhachHang) references khachhang(idKhachHang),
foreign key (idNhanVien) references nhanvien(idNhanVien)
);
insert into hopDong
values
(1,1,1,3,'2021-03-31','2021-04-21',500,2000),
(2,2,1,2,'2019-03-31','2021-04-21',500,2000),
(3,3,3,3,'2018-03-15','2021-04-21',500,2000),
(4,1,1,3,'2019-10-15','2021-04-21',600,2000),
(5,4,4,2,'2019-12-27','2021-04-21',300,2000);

create table dichVuDiKem(
idDichVuDiKem int not null primary key,
tenDichVuDiKem varchar(45) not null,
gia double not null,
donVi varchar(45) not null,
trangThaiKhaDung text not null
);

insert into dichVuDiKem
values
(1,'Ăn Sáng',200,'VND','Còn chỗ'),
(2,'Massage',500,'VND','Còn chỗ'),
(3,'Bơi',100,'VND','Còn chỗ');

create table hopDongChiTiet(
idHopDongChiTiet int not null ,
idDichVuDiKem int not null,
soLuong int not null,
idHopDong int not null,

 foreign key(idHopDong) references hopDong(idHopDong),
 foreign key(idDichVuDiKem) references dichVuDiKem(idDichVuDiKem)
);

insert into hopDongChiTiet
value
(1,1,1,1),
(2,2,2,1),
(3,3,3,4),
(4,3,2,2),
(5,1,1,5);




