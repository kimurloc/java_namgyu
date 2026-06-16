select min(created_at) from member;

select * from member;

select * from member
where created_at = (select min(created_at) from member);

select distinct member_id from post where member_id is not null;

select * from member where id in (select distinct member_id from post where member_id is not null);

select id, title from post;

select count(*) from reply where post_id = 1;

select id, title, (select count(*) from reply where post_id = post.id) as reply_count
from post;

select p.id, p.title, count(*) from post p
inner join reply r on p.id = r.post_id
group by p.id, p.title;

select distinct member_id from post where member_id is not null;

select member_id, count(*) from post 
where member_id is not null 
group by member_id;

select avg(cnt)
from (
	select member_id, count(*) as cnt
	from post
	where member_id is not null
	group by member_id
) as sub;

select member_id, count(*) as post_count
from post
where member_id is not null
group by member_id 
having count(*) > (
	select avg(cnt)
	from (
		select member_id, count(*) as cnt
		from post
		where member_id is not null
		group by member_id
	) as sub
);

select 1 from post where member_id = 4;