select * from post;

select id, member_id, title, view_count from post;

select post.id, member_id, title, view_count, member.id, member.name, member.email
from post
inner join member on post.member_id = member.id;

select p.id, member_id, title, view_count, m.id, m.name, m.email
from post p
inner join member as m on p.member_id = m.id;

select id, content, member_id, post_id from reply;

select reply.id, reply.content, reply.member_id, reply.post_id, member.name, post.title
from reply
inner join member on reply.member_id = member.id
inner join post on reply.post_id = post.id;

select post.title 게시글, reply.content 댓글, member.name 댓글작성자
from reply
inner join member on reply.member_id = member.id
inner join post on reply.post_id = post.id
order by post.id desc, reply.id;

select p.id, p.member_id, p.title, p.view_count, m.name, m.email
from post p
left outer join member as m on p.member_id = m.id;

select p.id, p.member_id, p.title, p.view_count, m.name, m.email
from post p
right join member as m on p.member_id = m.id;

select p.id, p.member_id, p.title, p.view_count, m.name, m.email
from member m
left join post as p on p.member_id = m.id;

select m.id as member_id, m.name, p.title
from member m
left join post p on m.id = p.member_id;

select * from member;

select m.id, m.name, count(p.id) post_count from member m
left join post p on m.id = p.member_id
group by m.id, m.name;

select m.id as member_id, m.name, p.title
from member m
right join post p on m.id = p.member_id;

select m1.name 회원명, m1.recommender_id, ifnull(m2.name, '-') 추천인명
from member m1
left join member m2 on m1.recommender_id = m2.id;
-- inner join member m2 on m1.recommender_id = m2.id;