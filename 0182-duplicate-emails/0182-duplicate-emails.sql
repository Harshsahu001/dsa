# Write your MySQL query statement below
select email as email 
from person
group by email having count(distinct id)>1;