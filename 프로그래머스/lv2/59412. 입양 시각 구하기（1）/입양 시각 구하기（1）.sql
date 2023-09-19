select HOUR(DATETIME) as HOUR, count(DATETIME) as COUNT
from ANIMAL_OUTS
where HOUR(DATETIME) >= 9 and HOUR(DATETIME) < 20
group by HOUR
order by HOUR;
