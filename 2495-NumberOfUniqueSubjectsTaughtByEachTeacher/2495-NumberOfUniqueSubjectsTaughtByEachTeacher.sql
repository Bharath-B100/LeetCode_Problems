-- Last updated: 5/25/2026, 11:10:27 AM
# Write your MySQL query statement below
Select  teacher_id ,
count(distinct subject_id ) as cnt from Teacher
group by teacher_id