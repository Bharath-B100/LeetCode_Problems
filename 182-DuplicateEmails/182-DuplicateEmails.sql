-- Last updated: 5/25/2026, 11:16:08 AM
# Write your MySQL query statement below
select email as Email from Person
group by email
having count(email) > 1