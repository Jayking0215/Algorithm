select b.BOOK_ID, a.AUTHOR_NAME, date_format(b.PUBLISHED_DATE, '%Y-%m-%d')
from BOOK as b
join AUTHOR as a
on a.AUTHOR_ID = b.AUTHOR_ID
where b.CATEGORY = '경제'
order by PUBLISHED_DATE;


# select b.BOOK_ID, a.AUTHOR_NAME, date_format(b.PUBLISHED_DATE, '%Y-%m-%d')
# from BOOK as b
# join AUTHOR as a
# on b.AUTHOR_ID = a.AUTHOR_ID
# where b.CATEGORY = '경제'
# order by PUBLISHED_DATE;