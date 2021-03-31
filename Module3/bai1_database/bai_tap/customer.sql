create database customer_management;

use customer_management;

create table customer(
id int primary key auto_increment,
customer_name varchar(10),
phone int,
city varchar(10),
 country varchar(10)

);

insert into customer(customer_name,phone,city,country)
value
('Hoa', 090512345,'Hà Nội', 'Việt nam'),
('Marry', 090512895,'New York', 'Mỹ'),
('Mi', 090512345,'Hà Nội', 'Việt Nam');

select customer_name
from customer
where customer_name = 'Mi';

delete from customer_management.customer
where customer_name = 'Marry';

update customer
set customer_name = 'Hoà'
where customer_name = 'Hoa';

alter table customer
add column email varchar(30);

drop table customer;