-- Last updated: 5/25/2026, 11:14:09 AM
# Write your MySQL query statement below
SELECT id, movie, description, rating
FROM Cinema
WHERE id % 2 != 0
  AND description != 'boring'
ORDER BY rating DESC;