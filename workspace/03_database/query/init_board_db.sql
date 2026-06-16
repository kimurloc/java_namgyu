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
	recommender_id INT,
	created_at datetime default CURRENT_TIMESTAMP(),
	
	foreign key (recommender_id) references member(id) on delete cascade
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
    VALUES (NULL, 'haru@gmail.com', 'pwd123', 'haru', '01012345678', null, DEFAULT);
INSERT INTO member 
    VALUES (NULL, 'namu@gmail.com', 'pwd456', 'namu', '01011112222', 1, '2025-05-10 12:13:45');

INSERT INTO member (email, password, name, recommender_id, created_at)
    VALUES ('brong@gmail.com', 'pwd789', 'brong', null, '2026-05-29 13:34:32');

INSERT INTO member (email, password, name, recommender_id, created_at) VALUES 
    ('harong2@gmail.com', 'pwd012', 'harong2', 1, '2026-05-29 13:34:32'),
    ('namu2@gmail.com', 'pwd456', 'namu2', 2, '2026-06-05 14:34:12'),
	('haru2@gmail.com', 'pwd222', 'haru2', null, '2026-06-07 17:17:48');

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

ALTER TABLE post ADD view_count int NOT NULL DEFAULT 0;

INSERT INTO post (member_id, title, content, created_at, view_count) VALUES
(1, 'Java 공부 시작', 'Java 처음 배우는데 생각보다 재밌다.', '2026-05-14 08:12:44', 28),
(2, '점심 추천 부탁', '요즘 매일 편의점인데 맛있는 거 추천해줘.', '2026-05-15 12:03:27', 11),
(3, '운동 시작했음', '오늘부터 헬스 등록함. 3개월 버텨보자.', '2026-05-16 19:45:09', 25),
(4, 'SQL JOIN 헷갈림', 'LEFT JOIN이랑 INNER JOIN 차이를 모르겠음.', '2026-05-19 09:05:33', 30),
(5, '카페 추천', '대구 수성못 근처 아인슈페너 맛있는 곳 찾음.', '2026-05-20 14:38:16', 8),
(1, 'Git 브랜치 뭐 씀?', '소규모 팀인데 Git Flow 쓰는 게 맞을까?', '2026-05-21 11:17:02', 26),
(2, '반려식물 추천', '관리 쉬운 식물 뭐가 있을까? 몬스테라 괜찮나?', '2026-05-22 20:55:38', 6),
(3, 'Spring 강의 추천', 'Java 기초 뗐는데 Spring 뭐부터 볼까?', '2026-05-24 08:44:20', 29),
(4, '오늘 TIL - 람다식', 'Java 람다 처음 써봤는데 코드가 짧아져서 신기함.', '2026-05-25 22:10:47', 9),
(5, '제주도 코스 추천', '3박4일 일정 짜는 중. 꼭 가볼 곳 알려줘.', '2026-05-27 16:02:09', 14),
(1, 'IntelliJ 단축키', '자주 쓰는 단축키 정리함. 생산성 올라감.', '2026-05-28 09:31:55', 30),
(2, 'REST API 설계', 'URL에 동사 쓰면 안 된다는데 실무는 어떻게 함?', '2026-05-29 13:50:28', 22),
(3, '알고리즘 스터디 모집', '매주 토요일 오전 같이 풀 사람 구함. 초급 환영.', '2026-05-30 07:28:14', 18),
(4, '수제 버거 만들어봄', '패티부터 번까지 직접 만듦. 생각보다 쉬움.', '2026-06-01 18:44:33', 7),
(5, '퇴근 후 루틴', '운동 → 독서 → 코딩 루틴 한 달째 유지 중.', '2026-06-03 21:07:48', 21),
(1, 'PATCH vs PUT 차이', 'API 설계하다가 헷갈려서 정리함.', '2026-06-05 10:15:22', 19),
(2, '취업 준비 팁 공유', '포폴, 코테, 면접 준비 경험 나눔.', '2026-06-10 09:02:37', 30),
(3, '요즘 읽는 책', '개발 책 말고 그냥 에세이 읽는 중. 환기 되는 느낌.', '2026-06-14 15:33:11', 5),
(null, '팀 프로젝트 후기', '첫 협업 프로젝트 끝남. 소통이 제일 중요하더라.', default, 27),
(null, '개발자 번아웃 극복', '슬럼프 왔을 때 어떻게 극복했는지 공유함.', default, 24);

INSERT INTO reply (post_id, member_id, content, created_at) VALUES
(3, 4, '날씨 좋은 날엔 산책이 최고죠.', '2026-06-10 14:02:18'),
(3, 5, '저도 오늘 밖에 나갔다 왔어요!', '2026-06-10 15:44:37'),
(6, 2, 'OOP 개념 잡히면 훨씬 재밌어짐.', '2026-05-14 10:27:53'),
(6, 3, '상속이랑 인터페이스가 핵심임.', '2026-05-15 07:38:11'),
(8, 1, '소규모면 GitHub Flow가 더 편함.', '2026-05-21 13:05:44'),
(8, 4, '커밋 메시지 컨벤션이 더 중요한 것 같음.', '2026-05-22 09:17:02'),
(9, 5, '3개월만 버티면 습관 됨. 파이팅.', '2026-05-17 08:30:22'),
(9, 1, '하체 운동 위주로 시작하는 거 추천.', '2026-05-18 19:55:48'),
(10, 2, 'INNER는 교집합, LEFT는 왼쪽 기준 전부라고 보면 됨.', '2026-05-19 10:14:05'),
(10, 3, '벤다이어그램으로 외우면 진짜 쉬움.', '2026-05-19 13:42:29'),
(10, 4, '실무에서 LEFT JOIN 제일 많이 씀.', '2026-05-20 08:03:57'),
(13, 5, '김영한 강사 강의 추천. 진짜 잘 가르침.', '2026-05-24 09:55:14'),
(13, 1, '인프런에서 입문 → 핵심 원리 순서로 들으면 됨.', '2026-05-24 14:28:40'),
(16, 2, 'Shift+Shift 알고 나서 진짜 편해짐.', '2026-05-28 10:47:33'),
(16, 3, 'Ctrl+Alt+L 자동 정렬도 자주 씀.', '2026-05-29 08:12:06'),
(17, 4, 'PATCH는 일부 수정, PUT은 전체 교체라고 보면 됨.', '2026-05-29 15:30:19'),
(17, 5, '팀 컨벤션 따르는 게 제일 중요함.', '2026-05-30 09:44:52'),
(18, 1, '저 참여하고 싶어요. 플랫폼이 어디인가요?', '2026-05-30 08:27:31'),
(20, 2, '루틴 유지하는 게 제일 어려운데 대단함.', '2026-06-04 07:18:44'),
(20, 3, '코딩은 뭐 공부하고 있음?', '2026-06-04 19:55:27'),
(21, 4, '이거 나도 맨날 헷갈렸는데 정리 감사함.', '2026-06-05 11:33:08'),
(22, 5, '포폴 깃허브에 올리는 거 추천함?', '2026-06-10 10:22:47'),
(22, 1, '코테는 백준이랑 프로그래머스 둘 다 풀어야 하나?', '2026-06-11 08:14:39'),
(22, 2, '면접 스터디 같이 할 사람 있으면 연락해요.', '2026-06-12 13:50:22'),
(24, 3, '소통 진짜 중요하지. 코드보다 사람이 어려움.', '2026-06-17 12:38:05'),
(24, 4, 'PR 리뷰 문화 있었음? 그게 소통에 제일 효과적이더라.', '2026-06-18 17:04:51'),
(25, 5, '저도 비슷한 시기 있었는데 잠깐 쉬는 게 제일 나았음.', '2026-06-20 10:47:13'),
(25, 1, '산책이나 운동이 의외로 도움 많이 됨.', '2026-06-20 14:22:38'),
(15, 2, '성산일출봉이랑 협재 해변은 필수임.', '2026-05-28 11:03:27'),
(15, 3, '동쪽이랑 서쪽 분위기 꽤 다름. 나눠서 짜봐.', '2026-05-29 16:48:09');

drop user if exists 'user1'@'localhost';

-- 로컬 호스트 전용 계정 생성
CREATE USER 'user1'@'localhost'
    IDENTIFIED BY '1111';

drop role if exists 'developer';

-- 개발자용 권한 그룹 생성
CREATE ROLE 'developer';

-- 개발자 그룹에 board_db의 모든 테이블에 대한 CRUD 권한 부여
GRANT SELECT, INSERT, UPDATE, DELETE ON board_db.* TO 'developer';

-- user1에게 개발자 그룹 권한 부여
GRANT 'developer' TO 'user1'@'localhost';

-- user1 로그인 시 developer 권한 그룹이 기본으로 활성화되도록 설정
SET DEFAULT ROLE 'developer' TO 'user1'@'localhost';
