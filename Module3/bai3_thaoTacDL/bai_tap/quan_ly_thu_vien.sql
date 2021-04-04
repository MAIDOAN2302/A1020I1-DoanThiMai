drop database quanLyThuVien;
create database quanLyThuVien;
use quanLyThuVien;

create table sach(
maSach varchar(15) primary key,
tenSach varchar(50),
nhaXuatBan varchar (50),
tacGia varchar (50),
namXuatBan date,
soLanXuatBan int,
gia double,
anh varchar(50)
);

insert into sach
value
('01','Tắt đèn','NXB thế giới', 'Ngô Tất Tố', '1998-01-01', 3, 45.500, 'abcd'),
('02','Truyện Kiều','NXB thế giới', 'Nguyễn Du', '1990-01-01', 3, 50.500, 'abcd'),
('03','Cậu vàng và Lão Hạc','NXB thế giới', 'Nam Cao', '1998-01-01', 3, 40000, 'abcd'),
('04','Cảm ơn người lớn','NXB tiền phong', 'Nguyễn Nhật Ánh', '2019-01-01', 1, 85000, 'abcd'),
('05','cây chuối non đi giày xanh','NXB tiền phong', 'Nguyễn Nhật Ánh', '1998-01-01', 2, 45.500, 'abcd');

create table sinhVien(
maSinhVien int primary key,
tenSinhVien varchar(50),
diachi varchar (500),
email varchar (50),
anh varchar(50)
);

insert into sinhVien
value 
(01, 'Nguyễn Văn A', 'HN', 'abc@abc1','anvm'),
(02, 'Nguyễn Văn Q', 'HN', 'abc@abc2','anvm'),
(03, 'Nguyễn Văn D', 'HN', 'abc@abc3','anvm'),
(04, 'Nguyễn Văn S', 'HN', 'abc@abc4','anvm'),
(05, 'Nguyễn Văn C', 'HN', 'abc@abc5','anvm');

create table loaiSach(
loaiSach varchar(50),
maSach varchar (50),
foreign key (maSach) references sach(maSach)
);

insert into loaiSach
value
('Văn Học', '01'),
('Truyện', '02'),
('Toán Học', '03'),
('Sử Học','04'),
('Hoá Học', '05');

create table phieuMuon(
maSinhVien int,
maSach varchar(15),
ngayMuon date,
ngayTra date,
soLuongMuon int,
trinhTrangSach text,

primary key(maSach, maSinhVien),
foreign key(maSach) references sach(maSach),
foreign key(maSinhVien) references sinhVien(maSinhVien) 	
);

insert into phieuMuon
value
(01,'01','2021-04-04','2021-04-15',2,'mới'),
(02,'02','2021-04-02','2021-04-10',2,'mới'),
(03,'03','2021-04-08','2021-04-16',2,'mới'),
(04,'04','2021-04-07','2021-04-18',2,'mới'),
(05,'05','2021-04-01','2021-04-11',2,'mới');
