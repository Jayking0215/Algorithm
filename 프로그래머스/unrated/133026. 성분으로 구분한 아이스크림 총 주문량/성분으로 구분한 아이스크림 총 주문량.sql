select i.INGREDIENT_TYPE, sum(f.TOTAL_ORDER)
from ICECREAM_INFO as i
join FIRST_HALF as f
on f.FLAVOR = i.FLAVOR
group by i.INGREDIENT_TYPE;





# select b.INGREDIENT_TYPE, sum(a.TOTAL_ORDER) as TOTAL_ORDER
# from FIRST_HALF as a
# join ICECREAM_INFO as b
# on a.FLAVOR = b.FLAVOR
# group by b.INGREDIENT_TYPE;