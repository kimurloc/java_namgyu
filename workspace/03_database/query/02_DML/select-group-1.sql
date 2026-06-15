select member_id, count(*)
from post
group by member_id;