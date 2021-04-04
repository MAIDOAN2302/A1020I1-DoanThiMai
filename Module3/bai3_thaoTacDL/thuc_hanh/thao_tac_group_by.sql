drop database thaoTacVoiGroupBy;
create database thaoTacVoiGroupBy;
use thaoTacVoiGroupBy;

create table orders(
orderNumber int primary key,
orderDate date,
requiredDate date,
shippedDate date,
`status` text,
`comment` text,
custerNumber int
);

insert into orders(orderNumber,`status`,orderDate)
value 
(01,'shipping','2003-05-23'),
(02,'shipped','2004-05-23'),
(03,'shipping','2005-05-23');

select `status` from orders
group by `status`;

select `status`, count(*) as 'số lương status'
from orders
group by `status`;

create table orderDetails(
orderNumber int,
productNumber int,
quantilyOrdered int,
priceEach double,
orderLineNumber int,
foreign key(orderNumber) references orders(orderNumber) 
);

insert into orderDetails
value 
(01,111,10,200,001),
(02,112,10,250,002),
(03,113,10,350,003);

select `status`, sum(quantilyOrdered*priceEach) as amount
from orders
inner join orderDetails
on orders.orderNumber = orderDetails.orderNumber
group by `status`;

select orderNumber, sum(quantilyOrdered*priceEach) as total
from orderDetails
group by orderNumber;

select year(orderDate) as `year`, sum(quantilyOrdered*priceEach) as total
from orders
inner join orderDetails
on orders.orderNumber = orderDetails.orderNumber
where `status` = 'shipped'
group by `year`
having `year` > 2003;