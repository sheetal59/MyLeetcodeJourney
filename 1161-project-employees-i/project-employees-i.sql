# Write your MySQL query statement below
Select project_id, round(AVG(e.experience_years),2) as average_years from Project p Left Join
Employee e on p.employee_id = e.employee_id group by 1;