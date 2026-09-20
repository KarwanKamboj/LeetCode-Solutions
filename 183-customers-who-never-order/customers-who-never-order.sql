# Write your MySQL query statement below

SELECT name AS Customers FROM Customers LEFT JOIN Orders ON customers.id = orders.customerId WHERE orders.customerId IS NULL;