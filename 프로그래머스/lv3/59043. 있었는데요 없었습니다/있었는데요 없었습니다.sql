select outs.ANIMAL_ID, outs.NAME
from ANIMAL_OUTS as outs
join ANIMAL_INS as ins
on outs.ANIMAL_ID = ins.ANIMAL_ID
where outs.DATETIME < ins.DATETIME
order by ins.DATETIME;