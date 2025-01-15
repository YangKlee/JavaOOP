create database SMS
use SMS
--Customer (customer_id, customer_name)--
create table Customer(
	customer_id int primary key,
	customer_name nvarchar(50) not null
);
--Employee (employee_id, employee_name, salary, supervisor_id)--
create table Employee(
	employee_id int primary key,
	employee_name nvarchar(50),
	salary float not null ,
	supervisor_id int
);
--Product (product_id, product_name, list_price)--
create table Product(
	product_id int primary key,
	product_name nvarchar(50) not null,
	list_price float not null
);
--orders (order_id, order_date, customer_id, employee_id, total)--
create table orders(
	order_id int primary key,
	order_date date not null,
	customer_id int not null foreign key references Customer(customer_id)
	on update cascade on delete cascade,
	employee_id int not null foreign key references Employee(employee_id)
	on update cascade on delete cascade,
	total float not null
);
--LineItem (order_id, product_id, quantity, price)--
create table LineItem(
	order_id int not null foreign key references orders(order_id)
	on update cascade on delete cascade,
	product_id int not null foreign key references Product(product_id)
	on update cascade on delete cascade,
	quantity int not null,
	price float not null,
	primary key ( order_id, product_id)
);