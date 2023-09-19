select ANIMAL_TYPE, count(ANIMAL_TYPE) as count
from ANIMAL_INS
group by ANIMAL_TYPE like '%Cat%'
order by ANIMAL_TYPE;