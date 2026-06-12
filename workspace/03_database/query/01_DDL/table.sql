create table member (
	id int auto_increment primary key,
	email varchar(100) not null unique,
	password varchar(50) not null,
	name varchar(50) not null,
	phone char(12),
	created_at datetime default CURRENT_TIMESTAMP()
);

create table post (
	id int auto_increment primary key,
	writer_id int,
	title varchar(50) not null,
	content text not null,
	created_at datetime default CURRENT_TIMESTAMP(),
	
	foreign key (writer_id) references member(id) ON DELETE SET null
);

create table comment (
	id int auto_increment primary key,
	post_id int not null,
	writer_id int not null,
	content text not null,
	created_at datetime default CURRENT_TIMESTAMP(),
	
	foreign key (post_id) references post(id) ON DELETE cascade,
	foreign key (writer_id) references member(id) ON DELETE cascade
);

-- add column
ALTER TABLE member ADD phone varchar(20);

-- edit column
ALTER TABLE member modify phone varchar(30) not null;

-- delete column
alter table member drop column phone;

drop table comment;

-- post 테이블의 모든 데이터를 비우고 처음 생성된 상태로 초기화 (DROP과 달리 구조는 남기며, DELETE보다 연산 속도가 매우 빠름)
TRUNCATE TABLE post;