select o.ANIMAL_ID, o.NAME
from ANIMAL_OUTS as o
join ANIMAL_INS as i
on o.ANIMAL_ID = i.ANIMAL_ID
where o.DATETIME < i.DATETIME
order by i.DATETIME;


# select outs.ANIMAL_ID, outs.NAME
# from ANIMAL_OUTS as outs
# join ANIMAL_INS as ins
# on outs.ANIMAL_ID = ins.ANIMAL_ID
# where outs.DATETIME < ins.DATETIME
# order by ins.DATETIME;