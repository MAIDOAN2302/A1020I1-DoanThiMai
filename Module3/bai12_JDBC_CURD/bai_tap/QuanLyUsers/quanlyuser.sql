drop database if exists quanlyusers;
create database quanlyusers;
use quanlyusers;

create table quanlyuser(
id int not null auto_increment,
`name` varchar(120) not null,
email varchar(220) not null,
country varchar(120),
primary key(id)
);

insert into quanlyuser(`name`,email,country)
values
('Minh','minh@codegym.vn','Viet Nam'),
('Mai','mai@codegym.vn','Viet Nam'),
('Hoa','hoa@codegym.vn','Viet Nam');

select*from quanlyuser where id = 1;

delete from quanlyuser where id = 1;

update quanlyuser set `name` = "mi", email = "mi123@123.com",country = "Viet Nam" where id = 1;

select * from quanlyuser where country = "Viet Nam";