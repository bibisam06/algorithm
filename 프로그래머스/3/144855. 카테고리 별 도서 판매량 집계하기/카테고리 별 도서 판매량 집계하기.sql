-- 코드를 입력하세요
SELECT b.category, sum(s.sales) as total_sales
from book as b join book_sales as s
on b.book_id = s.book_id
WHERE SALES_DATE >= '2022-01-01' AND SALES_DATE <= '2022-01-31'
group by category
order by category asc;