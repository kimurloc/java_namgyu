-- 외래키 관계를 감안하여 삭제순서 결정
drop table if exists reply;
drop table if exists post;
drop table if exists member;

-- drop database if exists board_db;

-- create database board_db;

-- USE board_db;

CREATE TABLE member (
	id int auto_increment primary key,
	email varchar(100) not null unique,
	password varchar(50) not null,
	name varchar(50) not null,
	phone char(12),
	created_at datetime default CURRENT_TIMESTAMP()
);

CREATE TABLE post (
	id int auto_increment primary key,
	member_id int,
	title varchar(50) not null,
	content text not null,
	created_at datetime default CURRENT_TIMESTAMP(),
	
	foreign key (member_id) references member(id) ON DELETE SET null
);

CREATE TABLE reply (
	id int auto_increment primary key,
	post_id int not null,
	member_id int not null,
	content text not null,
	created_at datetime default CURRENT_TIMESTAMP(),
	
	foreign key (post_id) references post(id) ON DELETE cascade,
	foreign key (member_id) references member(id) ON DELETE cascade
);

INSERT INTO member 
    VALUES (NULL, 'haru@gmail.com', 'pwd123', 'haru', '01012345678', DEFAULT);
INSERT INTO member 
    VALUES (NULL, 'namu@gmail.com', 'pwd456', 'namu', '01011112222', '2026-05-10 12:13:45');

INSERT INTO member (email, password, name, created_at)
    VALUES ('brong@gmail.com', 'pwd789', 'brong', '2026-05-29 13:34:32');

INSERT INTO member (email, password, name, created_at) VALUES 
    ('harong2@gmail.com', 'pwd012', 'harong2', '2026-05-29 13:34:32'),
    ('namu2@gmail.com', 'pwd456', 'namu2', '2026-06-05 14:34:12');

-- 게시글 데이터 삽입
INSERT INTO post (member_id, title, content, created_at)
VALUES (1, '첫 번째 게시글', '안녕하세요. 반갑습니다.', '2026-06-10 12:33:54');

INSERT INTO post (member_id, title, content, created_at)
VALUES (2, '질문 있습니다', '데이터베이스 기초에 대한 질문입니다.', '2026-06-10 13:33:14');

INSERT INTO post (member_id, title, content, created_at)
VALUES (1, '두 번째 게시글', '오늘 날씨가 아주 좋습니다.', '2026-06-10 13:34:7');

INSERT INTO post (member_id, title, content, created_at)
VALUES (2, 'MySQL 설치 오류 해결방법', '설치 중 Configurator 단계에서 오류가 날 때 대처법 공유합니다.', '2026-06-11 09:33:52');

INSERT INTO post (member_id, title, content, created_at)
VALUES (3, '자기 소개', '안녕하세요 하롱이입니다.', '2026-06-11 12:03:24');

-- 댓글 데이터 삽입
INSERT INTO reply (post_id, member_id, content)
VALUES (1, 2, '환영합니다!');

INSERT INTO reply (post_id, member_id, content)
VALUES (1, 3, '반가워요~');

INSERT INTO reply (post_id, member_id, content)
VALUES (2, 1, '어떤 부분이 궁금하신가요?');

INSERT INTO reply (post_id, member_id, content)
VALUES (4, 3, '정말 유용한 정보네요. 감사합니다!');

INSERT INTO reply (post_id, member_id, content)
VALUES (4, 1, '저도 이 방법으로 해결했습니다.');