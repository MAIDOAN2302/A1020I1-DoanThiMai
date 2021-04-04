drop database if exists contacs;
create database contacs;
use contacs;

create table contacs(
contacs_id int(11) not null auto_increment,
last_name varchar(30) not null,
first_name varchar(25),
date_of_birth date,
constraint contacs_pk primary key(contacs_id)
);

alter table contacs
add last_name1 varchar (40) not null
after contacs_id;

alter table contacs
rename to people;

create table suppliers
(suppliers_id int(11) not null auto_increment,
suppliers_name varchar (50) not null,
account_rep varchar(30) not null default 'TBD',
constraint suppliers_pk primary key(suppliers_id)
);

alter table suppliers
add suppliers_last_name varchar(10) not null;

