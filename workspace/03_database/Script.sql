show databases

-- create board_db database
create database board_db;

-- select database
use board_db;

-- delete database
drop database board_db;

-- delete table
drop table member;

-- create emeber table
create table member (
	id int auto_increment primary key,
	email varchar(100) not null unique,
	password varchar(50) not null,
	name varchar(50) not null,
	created_at datetime default CURRENT_TIMESTAMP()
);

-- add data to member table
insert into member (email, password, name) values
	('haru@gmail.com', '123', 'haru');

insert into member (email, password, name) values
	('namu@gmail.com', '456', 'namu'),
	('harong@gmail.com', '789', 'harong');

-- check member table record
select id, email, password, name, created_at from member;

-- delete record
delete from member where id=1;

-- edit record
update member set email='haru@naver.com' where id = 1;

-- delete post table
drop table post;

-- create post table
create table post (
	id int auto_increment primary key,
	writer_id int not null,
	title varchar(50) not null,
	content varchar(255) not null,
	created_at datetime default CURRENT_TIMESTAMP(),
	
	foreign key (writer_id) references member(id)
);

-- add data to post table
insert into post (writer_id, title, content) values
	(1, 'hello!', 'hello world!'),
	(3, 'Hello!', 'Hello haru!');

-- check post table record
select id, writer_id, title, content, created_at from post;

-- create comment table
create table comment (
	id int auto_increment primary key,
	post_id int not null,
	writer_id int not null,
	content varchar(128) not null,
	created_at datetime default CURRENT_TIMESTAMP(),
	
	foreign key (post_id) references post(id),
	foreign key (writer_id) references member(id)
);

-- add data to comment table
insert into comment (post_id, writer_id, content) values
	(2, 1, 'hello harong!');

-- check comment table record
select post_id, writer_id, content from comment;