# Write your MySQL query statement below
Select w.id from Weather as w JOIN Weather as x 
where DATEDIFF(w.recordDate, x.recordDate)=1  AND w.temperature > x.temperature;