select p.PRODUCT_CODE, sum(p.PRICE * o.SALES_AMOUNT)as SALES
from PRODUCT as p
join OFFLINE_SALE as o
on p.PRODUCT_ID = o.PRODUCT_ID
group by p.PRODUCT_ID
order by SALES desc, PRODUCT_CODE;



# select a.PRODUCT_CODE, sum(a.PRICE * b.SALES_AMOUNT) as SALES
# from PRODUCT as a
# join OFFLINE_SALE as b
# on a.PRODUCT_ID = b.PRODUCT_ID
# group by a.PRODUCT_ID
# order by SALES desc, PRODUCT_CODE;