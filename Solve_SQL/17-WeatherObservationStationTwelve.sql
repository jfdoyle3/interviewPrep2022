SELECT DISTINCT city
FROM station
WHERE city REGEXP '^[bcdfghjklmnpqrstvwyxz].*[bcdfghjklmnpqrstvwyxz]$'