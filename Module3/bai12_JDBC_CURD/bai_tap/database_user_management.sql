drop database if exists users_management;
create database users_management;
use users_management;

create table users_management(
id int not null auto_increment,
`name` varchar(120) not null,
email varchar(220) not null,
country varchar(120),
primary key(id)
);

insert into users_management(`name`,email,country)
values
('Minh','minh@codegym.vn','Viet Nam'),
('Mai','mai@codegym.vn',' Nam'),
('Hoa','hoa@codegym.vn','Viet Nam');

select*from users_management where id = 1;

delete from users_management where id = 1;

update users_management set `name` = "mi", email = "mi123@123.com",country = "Viet Nam" where id = 1;

select * from users_management where country like "%Viet%";