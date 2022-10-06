# Write your MySQL query statement below
Select Customers.name as 'Customers' from Customers
left join Orders on Customers.id =  orders.customerId
where orders.customerId is null;
