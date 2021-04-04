drop database if exists car;
create database car;
use car;

create table productline(
productLineCode  varchar(50) not null primary key,
textDescription text not null,
image text
);

create table offices(
officeCode  varchar(10) not null primary key,
city  varchar(50) not null,
phone varchar(50) not null,
addressLine1  varchar(50) not null,
addressLine2  varchar(50) not null,
state   varchar(50) not null,
country   varchar(50) not null,
postalCode  varchar(15) not null
);

create table employees(
employeeNumber int not null primary key,
lastName  varchar(50) not null,
firstName   varchar(50) not null,
email varchar(100) not null,
jobTitle  varchar(50) not null,
officeCode  varchar(10) not null,

constraint officeCode_to_offices foreign key (officeCode) references offices(officeCode)
);

create table customers(
customerNumber  int not null primary key,
contactLastName   varchar(50) not null,
contactFirstName    varchar(50) not null,
phone varchar(50) not null,
addressLine1  varchar(50) not null,
addressLine2   varchar(50) not null,
city  varchar(50) not null,
state   varchar(50) not null,
postalCode    varchar(15) not null,
country     varchar(15) not null,
creditLimit double,
employeeNumber int not null,

constraint salesRepEmployeeNumber foreign key (employeeNumber) references employees(employeeNumber)
);


create table orders(
orderNumber  int not null primary key,
orderDate  date not null,
requiredDate  date not null,
shippedDate  date,
`status` varchar(15) not null,
comments text,
quantityOrdered  int not null,
customerNumber int not null,

constraint customerNumber_to_customer foreign key (customerNumber) references customers(customerNumber)
);


create table products(
productCode  varchar(15) not null primary key,
productName  varchar(70) not null,
productScale  varchar(10) not null,
productVendor  varchar(50) not null,
productDescription text not null,
quantityInStock int not null,
buyPrice  double not null,
MSRP  double not null,
productLineCode  varchar(50) not null,

constraint productLineCode_to_prducts foreign key (productLineCode) references productLine(productLineCode)
);

create table payments (
checkNumber  varchar(50) not null,
paymentDate  date not null,
amount  double not null,
customerNumber int not null,

constraint customerNumber foreign key (customerNumber ) references customers(customerNumber )
);



create table OrderDetails (
orderNumber  int not null ,
productCode  varchar(15) not null ,

primary key (orderNumber,productCode),
foreign key (orderNumber) references orders(orderNumber),
foreign key (productCode) references products(productCode)

);