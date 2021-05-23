drop database if exists users_update;
create database users_update;
use users_update;

create table users_update(
id int not null auto_increment,
`name` varchar(120) not null,
email varchar(220) not null,
country varchar(120),
primary key(id)
);

insert into users_update(`name`,email,country)
values
('Minh','minh@codegym.vn','Viet Nam'),
('Mai','mai@codegym.vn',' Nam'),
('Hoa','hoa@codegym.vn','Viet Nam');

select*from users_update where id = 1;

delete from users_update where id = 1;

update users_update set `name` = "mi", email = "mi123@123.com",country = "Viet Nam" where id = 1;

select * from users_update where country like "%Viet%";