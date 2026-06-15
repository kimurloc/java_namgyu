select name, email, concat(name,'(', email, ')') as member_info from member;

select email, length('hello'), length('안녕하세요'), length(email) as email_length
from member;

select content, replace(content, '안녕하세요', 'hi') as replaced_content
from post
where content like '%안녕하세요%';

select title, substring(title, 1, 10) as preview from post;

select title, replace(title, substring(title, 11), '...') as preview
from post;

select title, concat(substring(title, 1, 10), '...') as preview
from post;

select email, lower(email) as email_lower, upper(email) as email_upper
from member;

select now() as current_datetime;

select id, title, created_at, date_format(created_at, '%Y년 %m월 %d일 %a %H시 %i분 %s초') as write_date
from post;

select curdate() as curr_date;

select id, title, created_at
from post
where created_at >= curdate();

select id, name, created_at, curdate(), date_sub(curdate(), interval 7 day) as before_7days
from member
where created_at >= date_sub(now(), interval 7 day);

select * from member where created_at < date_sub(now(), interval 1 month);

select *, date_sub(curdate(), interval 1 month) as before_1month
from member
where created_at < date_sub(now(), interval 1 month);

select *, date_sub(curdate(), interval '35 12' day_hour) as before_1month
from member
where created_at < date_sub(now(), interval '35 12' day_hour);

select name, created_at, datediff(curdate(), created_at) as days_since_join
from member;

select count(*) from member;

select count(*) from post;

select member_id, count(*) as total_count
from post
where member_id = 3;

select member_id, count(*) as total_count, 
sum(view_count) as total_views, avg(view_count) as avg_view,
min(view_count) as min_views, max(view_count) as max_views
from post
where member_id = 3;

select name, ifnull(phone, '미등록') as phone
from member;

select name, ifnull(phone, ifnull(email ,'연락처 없음')) as contact
from member;

select name, coalesce(phone, email, '연락처 없음') as contact
from member;

select name, if(phone is null, '연락처 없음', '연락처 있음') as phone_status from member;

select name, if(phone is null, if(email is null, '연락처 없음', email), phone) as phone_status from member;

select name, created_at,
case
	when created_at < date_sub(now(), interval 1 year) then '우수 회원'
	when created_at < date_sub(now(), interval 1 month) then '일반 회원'
	else '신규 회원'
end as member_grade
from member;