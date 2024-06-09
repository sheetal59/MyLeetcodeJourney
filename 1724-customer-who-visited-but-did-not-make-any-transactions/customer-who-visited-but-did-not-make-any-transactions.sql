# Write your MySQL query statement below
select customer_id, COUNT(Visits.visit_id) as count_no_trans from Visits LEFT JOIN
Transactions on Visits.visit_id = Transactions.visit_id where Transactions.amount is NULL AND 
Transactions.transaction_id is NUll
group by Visits.customer_id;