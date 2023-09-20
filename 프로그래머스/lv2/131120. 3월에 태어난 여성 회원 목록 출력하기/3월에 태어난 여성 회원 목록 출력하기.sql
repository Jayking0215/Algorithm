select MEMBER_ID, MEMBER_NAME, GENDER, date_format(DATE_OF_BIRTH, '%Y-%m-%d')
from MEMBER_PROFILE
where date_format(DATE_OF_BIRTH, '%m') = '03' and GENDER = 'W' and TLNO is not null
order by MEMBER_ID;