create table users (
 id  int(3) NOT NULL AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);
insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');
select * from users order by name;

DELIMITER $$
CREATE PROCEDURE get_user_by_id(IN user_id INT)
BEGIN

    SELECT users.name, users.email, users.country

    FROM users

    where users.id = user_id;

    END$$
DELIMITER ;

call get_user_by_id(2)

DELIMITER $$
CREATE PROCEDURE insert_user(
IN user_name varchar(50),
IN user_email varchar(50),
IN user_country varchar(50)
)
BEGIN
    INSERT INTO users(name, email, country) VALUES(user_name, user_email, user_country);
END$$
DELIMITER ;
call insert_user('chanh','chanhtv@','vietnam');
select * from users;

DELIMITER $$
CREATE PROCEDURE get_all_users()
BEGIN
    select * from users;
END$$
DELIMITER ;
call get_all_users()