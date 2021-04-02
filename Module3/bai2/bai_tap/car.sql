drop database if exists car;
create database car;
use car;

create table products(
product_code int,
products_name varchar(50),
supplier varchar(50),
amount int,
price_buy double,
price_sell double
);

create table customers(
customer_number int,
customer_name varchar(50),
phone int,
adress varchar(50)
);

create table productline(
productline_code varchar(50),
describes varchar(200)
);

create table orders(
order_number varchar(30),
buy_date date,
request_date date,
delivery_date date,
order_amount int,
price double
);

create table payments (
payment_code varchar(30),
payment_date date,
amount_of_number double
);

create table employees(
employee_number varchar(30),
employee_name varchar(30),
email varchar(30),
job_name varchar(30)
);

create table offices(
);