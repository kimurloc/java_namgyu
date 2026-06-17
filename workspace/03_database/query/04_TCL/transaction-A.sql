SELECT * FROM post;

SELECT * FROM member;

start transaction;

DELETE FROM post WHERE member_id = 2;

DELETE FROM member WHERE id = 2;

commit;

rollback;