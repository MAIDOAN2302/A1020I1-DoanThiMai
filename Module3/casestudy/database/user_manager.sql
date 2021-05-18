CREATE DATABASE user_manager;
USE user_manager;

create table user_manager (
	id int(3) NOT NULL auto_increment,
    `name` varchar(120) not null,
    email varchar(220) not null,
    country varchar(120),
    primary key(id)
);

insert into user_manager(`name`,email,country)
values('Minh','minh@codegym.vn','Viet Nam');
insert into user_manager(`name`,email,country)
values('Kante','kante@che.uk','Kenia');