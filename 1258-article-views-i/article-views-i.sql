# Write your MySQL query statement below
SELECT distinct (author_id) as id from Views where author_id=viewer_id ORDER BY author_id;