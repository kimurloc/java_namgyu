select * from reply where id = 1;

-- 1번 댓글 삭제
DELETE FROM reply
    WHERE id = 1;

select * from reply where id = 2;
-- 2번 게시글 삭제 (게시글 테이블 생성 시 ON DELETE CASCADE 제약 조건을 지정했으므로, 게시글 삭제 시 관련된 하위 댓글 데이터도 함께 자동 삭제됨)
DELETE FROM post
    WHERE id = 2;

select * from member where id = 1;
delete from member where id = 1;