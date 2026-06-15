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