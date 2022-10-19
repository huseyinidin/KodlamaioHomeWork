Select  -- Comment line //

Select * from customers
-- Select columns from the customer table

Select ContactName,CompanyName,City from Customers
-- Select column names in customers table

Select ContactName conName,CompanyName comName,City city Sehir from Customers
--signature

Select * from Customers where City = 'London'
-- Choose the city of london

Select * from products
-- Select columns from the customer table

SElEct * from Products where CategoryID=1	
-- Case insensitive

sElEct * from Products where CategoryID=1 and UnitPrice >=10
--Price equal to or higher than 10 and choose category 1

Select * from Products order by ProductName
-- Sort by product name

Select * from Products order by CategoryID
-- Sort by CategoryID

Select * from Products order by CategoryID ,ProductName	
-- Sort by category and product name

Select * from Products order by UnitPrice
-- Sort by price, default value ascending

Select * from Products order by UnitPrice asc
-- Sort by price ascending

Select * from Products order by UnitPrice desc
-- Sort by price decending

Select * from Products where CategoryID order by UnitPrice desc
-- Choose category and decreasing price

Select count(*) from Products
--count all rows in products table //count(*) all rows

Select count(*) from Products where CategoryID
--Select the category number of 2 in the products table

Select count(*) Amount from Products where CategoryID
--Amount

Select CategoryID from Products group by CategoryID
--Select all categoryid without repeating

Select CategoryID ,count(*) from Products group by CategoryID
--Select the number of products in the categories

Select CategoryID ,count(*) from Products group by "CategoryID"  having count(*) <10 	
--Choose categories with less than 10

Select CategoryID ,count(*) from Products where UnitPrice >20 group by CategoryID  having count(*) <10 	
--Choose category numbers with a price greater than 20 and those with category numbers less than 10

Select * from Products inner join Categories on 'products.CategoryID' = 'categories.CategoryID' 
--Select all products and categories

Select ProductID, ProductName, UnitPrice, CategoryName  from Products inner join Categories on 'products.CategoryID' = 'categories.CategoryID'
--Select the id, name, price and category name in the products and category table

Select ProductID, ProductName, UnitPrice, CategoryName from Products inner join Categories on 'product.CategoryID' = 'categories.CategoryID' where "UnitPrice" > 10 	
--product and category inner join //  condition = on = Product.CategoryID = Categories.CategoryID
 where > Fetch products and categories with product price greater than 10. // code from

 DTO Data Transformation object

Select * from products inner join order_details

Select * from products inner join [order details] 
--if the table name has a space, it is enclosed in brackets

Select * from products p inner join order_details od on p.product_ID = od.Product_ID 
--inner join If two tables match, merge them.

Select * from products p left join order_details od on p.product_ID = od.Product_ID 
--it's in the products table on the left, find the unsold ones on the right

Select * from customers c left join orders o on c.customer_id = o.customer_id where o.customer_id is null 
--those who didn't buy any product > Primery key used

Select * from products p inner join order_details od on p.product_ID = od.Product_ID inner join orders o on o.order_id = od. order_id

Select * from products p inner join order_details od on p.product_ID = od.Product_ID 
--inner join If two tables match, merge them.

Select * from products p left join order_details od on p.product_ID = od.Product_ID 
--it's in the products table on the left, find the unsold ones on the right

Select * from customers c left join orders o on c.customer_id = o.customer_id where o.customer_id is null 
--those who didn't buy any product > Primery key used

Select * from products p inner join order_details od on p.product_ID = od.Product_ID inner join orders o on o.order_id = od. order_id  	
--New inner join added


