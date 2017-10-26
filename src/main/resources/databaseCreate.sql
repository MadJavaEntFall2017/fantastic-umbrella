drop database if exists fantastic_umbrella;
create database fantastic_umbrella;

use fantastic_umbrella;
drop table if exists people;
create table people (
	id int(11) not null auto_increment,
	gender varchar(20),
	name varchar(50),
	description varchar(1000),
	image_url varchar(60),
	primary key (id)
);

drop user if exists 'fantastic_umbrella'@'localhost';
create user 'fantastic_umbrella'@'localhost' identified by 'fantastic_pass';
grant all on fantastic_umbrella.* to 'fantastic_umbrella'@'localhost';
flush privileges;