drop database truyVanDLTuNhieuBang;
create database truyVanDLTuNhieuBang;
use truyVanDLTuNhieuBang;

create table customers(
customerNumber int primary key,
customerName varchar(30),
contactLastName varchar(30),
contactFirtName varchar(30),
phone varchar (30),
addressLine1 varchar (30),
addressLine2 varchar (30),
city varchar (30),
state varchar(30),
postCode varchar(30),
country varchar(30),
salesRepEmployeeNumber varchar(30),
creditLimit varchar(30)
);

insert into customers(customerNumber,customerName,phone,city)
value
(111,'Nguyễn Văn A','0905156645','HN'),
(112,'Nguyễn Văn C','090518945','DN'),
(113,'Nguyễn Văn E','090556345','HCM');

create table orders (
orderNumber varchar(30),
oderDate date,
requiredDate date,
shippedDate date,
`status` varchar(30),
comments varchar(30),
customerNumber int,
foreign key (customerNumber) references customers(customerNumber)
);

insert into orders(customerNumber,orderNumber,`status`)
value 
(111,011,'shipped'),
(112,012,'shipping'),
(113,013,'shipped');

select customers.customerNumber,customers.customerName, orders.orderNumber,orders.`status`
from customers
left join orders
on customers.customerNumber = orders.customerNumber;

create table payments(
customerNumber int,
checkNumber int,
paymentDate date,
amount double,
foreign key (customerNumber) references customers(customerNumber)
);

insert into payments(customerNumber,paymentDate,amount)
value
(111, '2020-12-03', 10),
(112, '2020-10-03', 10),
(113, '2020-11-03', 10);

select customers.customerNumber, customerName, phone, paymentDate,amount
from customers
inner join payments
on customers.customerNumber = payments.customerNumber
where city = 'HN';