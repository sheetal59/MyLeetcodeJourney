# Write your MySQL query statement below
Select name, bonus from Employee e  LEFT JOIN Bonus b ON
e.empId = b.empId where bonus<1000 or bonus is null;