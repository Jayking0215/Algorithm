select MCDP_CD as '진료과 코드', count(APNT_NO) as '5월예약건수'
from APPOINTMENT
where date_format(APNT_YMD, '%Y-%m') = '2022-05'
group by MCDP_CD
order by count(APNT_NO), MCDP_CD;




# select MCDP_CD as '진료과 코드', count(PT_NO) as '5월예약건수'
# from APPOINTMENT
# #where date_format(APNT_YMD, '%Y-%m') = '2022-05'
# where APNT_YMD like '2022-05%'
# group by MCDP_CD
# order by count(PT_NO), MCDP_CD