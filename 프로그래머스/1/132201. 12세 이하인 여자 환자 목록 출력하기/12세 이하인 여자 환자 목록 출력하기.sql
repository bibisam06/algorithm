SELECT 
    PT_NAME,
    PT_NO,
    GEND_cd,
    age,
    IFNULL(tlno, 'NONE')as tlno
FROM patient
WHERE age <= 12 AND gend_cd = 'W'   
ORDER BY age desc, pt_name asc;