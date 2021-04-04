drop database if exists bank_account_management;
create database bank_account_management;
use bank_account_management;

create table customers(
customer_number int primary key,
fullname varchar(30),
address varchar(30),
email varchar (30),
phone int
);

create table accounts(
account_number int primary key,
account_type varchar(30),
dates date,
balance double,
customer_number int,

constraint fk_customers foreign key (customer_number) references customers(customer_number)
);

create table transactions (
transactions_number int primary key,
account_number int,
dates date,
amounts double,
descriptions varchar(150),
account_numbers  int,

constraint fk_account_number foreign key (account_numbers) references accounts(account_number)
);


