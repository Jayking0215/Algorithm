select a.PRODUCT_CODE, sum(a.PRICE * b.SALES_AMOUNT) as SALES
from PRODUCT as a
join OFFLINE_SALE as b
on a.PRODUCT_ID = b.PRODUCT_ID
group by a.PRODUCT_ID
order by SALES desc, PRODUCT_CODE;