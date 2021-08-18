drop database if exists furuma;
create database furuma;
use furuma;

create table location(
location_id int not null primary key,
location_name varchar(45) not null
);

insert into location
values
(1,'Reception'),
(2,'Staff'),
(3,'Consultant'),
(4,'Supervisory '),
(5,'Chief'),
(6,'Manager');

create table education_degree(
education_degree_id int not null primary key,
education_degree_name varchar(45) not null
);

insert into education_degree
values
(1,'Intermediate'),
(2,'College'),
(3,'University'),
(4,'Postgraduate');

create table division(
division_id int not null primary key,
division_name varchar(45) not null
);

insert into division
values
(1,'Sale – Marketing'),
(2,'Administrative'),
(3,'Service_department'),
(4,'Management_department');

create table role(
role_id int not null primary key,
role_name varchar(255) not null
);

create table user(
username varchar(255) not null primary key,
`password` varchar(255)
);

create table user_role(
role_id int not null,
username varchar(255),

foreign key (role_id) references role(role_id),
foreign key (username) references user (username)
);

create table employee(
employee_id int not null primary key auto_increment,
employee_name varchar(45) not null,
employee_birthday date not null,
employee_id_card varchar(45) not null,
employee_salary double not null,
employee_phone varchar(45) not null,
employee_email varchar(45) not null,
employee_address varchar(45) not null,
location_id int,
education_degree_id int,
division_id int,

foreign key (location_id) references location(location_id),
foreign key (education_degree_id) references education_degree(education_degree_id),
foreign key (division_id) references division(division_id )
);

insert into employee
values
(01,'Doan Thi Mai','1992-02-23','001','1000','0976592396','maidoan2302@gmail.com','Quang Nam',6,4,4),
(02,'Nguyen Thi Thao','1993-12-23','002','800','0906592397','thaonguyen@gmail.com','Da Nang',5,3,3),
(03,'Hoang Thi Hoa','1988-11-06','003','1000','0905299156','hoanhoang@gmail.com','Ho Chi Minh',4,2,1),
(04,'Huynh Phuong Thu','1990-10-16','004','1000','035698723','thuhuynh@gmail.com','Ha Noi',2,1,1),
(05,'Nguyen Tuong Vi','1991-08-21','005','500','0789236496','vituong@gmail.com','Quang Binh',1,3,2);


create table customer_type(
customer_type_id int not null primary key,
customer_type_name varchar(45) not null
);

insert into customer_type
values
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');

create table customer(
customer_id int not null primary key auto_increment,
customer_type_id int not null,
customer_name varchar(45) not null,
customer_birthday date not null,
customer_gender bit(1) not null,
customer_id_card varchar(45) not null,
customer_phone varchar(45) not null,
customer_email varchar(45) not null,
customer_address varchar(45),

foreign key(customer_type_id) references customer_type(customer_type_id)
);

insert into customer
values
(01,1,'Ho Ngoc Lam','1992-04-20',0,'001','06934682','lamho@gmail.com','Quang Nam'),
(02,2,'Phan Huy Thanh','1992-11-20',0,'002','0905369845','thanhphan@gmail.com','Da Nang'),
(03,3,'Pham Thu Thao','2001-07-20',1,'003','036698745','thaopham@gmail.com','Phu Yen'),
(04,4,'Nguyen Thu Thom','1998-03-15',1,'004','06897456','thomnguyen@gmail.com','Vinh'),
(05,5,'Nguyen Van Tin','1978-06-03',0,'005','03265979','tinnguyen@gmail.com','Ha Noi'),
(06,1,'Ho Ngoc Lam','1992-04-20',0,'001','06934682','lamho@gmail.com','Quang Nam'),
(07,2,'Phan Huy Thanh','1992-11-20',0,'002','0905369845','thanhphan@gmail.com','Da Nang'),
(08,3,'Pham Thu Thao','2001-07-20',1,'003','036698745','thaopham@gmail.com','Phu Yen'),
(09,4,'Nguyen Thu Thom','1998-03-15',1,'004','06897456','thomnguyen@gmail.com','Vinh'),
(10,5,'Nguyen Van Tin','1978-06-03',0,'005','03265979','tinnguyen@gmail.com','Ha Noi');

create table rent_type(
rent_type_id int not null primary key,
rent_type_name varchar(45) not null,
rent_type_cost double not null
);

insert into rent_type
values
(1, 'Rent By Year',4000),
(2, 'Rent By Month', 3000),
(3, 'Rent By Day', 2000),
(4, 'Rent By Hour', 1000);

create table service_type(
service_type_id int not null primary key,
service_type_name varchar(45) not null
);

insert into service_type
values
(1, 'Vip'),
(2, 'Normal');

create table service(
service_id int not null primary key,
service_name varchar(45) not null,
service_area int not null,
service_cost double not null,
service_max_people int not null,
rent_type_id int not null,
service_type_id int not null,
standard_room varchar(45) not null,
description_other_convenience varchar(45),
pool_area double,
number_of_floors int,

foreign key (rent_type_id) references rent_type(rent_type_id),
foreign key (service_type_id) references service_type(service_type_id)
);

insert into service
values
(1,'Villa',500,3000,15,1,1,'Double bed','Sea view',50,3),
(2,'House',400,2000,10,2,2,'Single bed','Sea view',40,2),
(3,'Room',200,1000,3,3,2,'Single bed','Sea view',20,1);

create table contract(
contract_id int not null primary key,
contract_start_date datetime not null,
contract_end_date datetime not null,
contract_deposit double not null,
contract_total_money double not null,
employee_id int,
customer_id int not null,
service_id int not null,

foreign key (employee_id) references employee(employee_id),
foreign key (customer_id) references customer(customer_id),
foreign key (service_id) references service(service_id)
);

insert into contract
values
(1,'2020-05-15','2021-05-15',500,5000,1,1,1),
(2,'2020-05-15','2021-05-15',500,5000,2,2,2),
(3,'2020-05-15','2021-05-15',500,5000,3,3,3),
(4,'2020-05-15','2021-05-15',500,5000,4,4,1),
(5,'2020-05-15','2021-05-15',500,5000,5,5,2);

create table attach_service(
attach_service_id int not null primary key,
attach_service_name varchar(45),
attch_service_cost double,
attach_service_unit int,
attach_service_status varchar(45)
);

insert into attach_service
values
(1,'Massage',200,1,'Stocking'),
(2,'Karaoke',200,2,'Over'),
(3,'Food',200,2,'Over'),
(4,'Drinks ',200,2,'Stocking'),
(5,'Rent Car',500,1,'Stocking');

create table contract_detail(
contract_detail_id int not null primary key,
contract_id int not null,
attach_service_id int not null,
quantily int not null,

foreign key(contract_id) references contract(contract_id),
foreign key(attach_service_id) references attach_service(attach_service_id)
);

insert into contract_detail
values
(1,1,1,1),
(2,2,1,2),
(3,3,1,3),
(4,4,1,4),
(5,5,1,5);





