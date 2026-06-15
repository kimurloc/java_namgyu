select member_id, count(*)
from post
group by member_id;

SELECT post_id, count(*) AS reply_count
from reply
group by post_id
order by reply_count desc;

select member_id, count(*) as post_count, sum(view_count) as total_views
from post
group by member_id
order by post_count, total_views desc;

select DATE_FORMAT(created_at, '%Y') as join_year, count(*) join_count
from member
group by DATE_FORMAT(created_at, '%Y');

select member_id, count(*) as post_count, sum(view_count) as total_views
from post
group by member_id
having post_count >= 10
order by post_count, total_views desc;

-- title로 group by?
select member_id, title, count(*) as post_count
from post
group by member_id;

select member_id, max(title), count(*) as post_count
from post
group by member_id;

select member_id, group_concat(title) as concat_title, count(*) as post_count
from post
group by member_id;

select member_id, title, count(*) as post_count
from post
group by member_id, title;

SELECT member_id, COUNT(*) AS post_count
    FROM post
    WHERE DATE_FORMAT(created_at, '%Y-%m') = '2026-06'
    GROUP BY member_id
    HAVING COUNT(*) >= 2;