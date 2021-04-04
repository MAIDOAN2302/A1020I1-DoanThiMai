drop database if exists student_file;
create database student_file;
use student_file;

create table table_of_class(
class_id int primary key,
`name` varchar(5)
);


create table accout_james(
`account` varchar(50) primary key,
`password` varchar(50)
);

create table intrustor(
instruster_id int primary key ,
class_id int

);

create table class(
class_id int,
class_name  char(7),
type_of_class_id int,

constraint class_pk primary key(class_id),
constraint class_fk foreign key (type_of_class_id)
	 references table_of_class(class_id)

);


create table student(
student_id int primary key not null,
student_name varchar(30) not null,
date_of_birth date,
accout_james_accout varchar(50),
class_id int,

foreign key (accout_james_accout) references accout_james(`account`),
foreign key (class_id) references class(class_id)
);

create table instrustor_teach_class(
instustor_id int,
class_id int,

primary key (instustor_id,class_id),
foreign key (instustor_id) references intrustor(instruster_id),
foreign key (class_id) references class(class_id)
);
