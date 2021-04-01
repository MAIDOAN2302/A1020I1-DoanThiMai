create database student_management;
use student_management;

create table student(
id int primary key auto_increment,
 `name`varchar(50),
 date_of_birth date
 );
 insert into student(`name`, date_of_birth)

values 
('Tiến', '2021-03-31'),
('Mân', '1998-03-31'),
('Trường', '2000-03-31'),
('Thanh', '1991-03-31');

select `name`
from student
where `name` = 'Thanh';

delete from student
where id = 2;

update student
set `name` = 'Mai'
where `name` = 'Thanh';

alter table student
add column email varchar(30);

 
insert into student (email)
value ('abc@abc')



drop table student;
