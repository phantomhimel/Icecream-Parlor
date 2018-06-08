# Resources used 
<ul>
  <li> Java Graphical User Interface (SWING) </li>
  <li> Microsoft SQL Server </li>
  
  # DataBase and Table
  
  CREATE DATABASE Icecream_parlor
  
  create table Product_table
  (
  Flavour_name varchar (25) not null primary key,
  price float not null
  )
  
  create table Selling_table
  (
  Flavour_name varchar (25) not null foreign key references Product_table( Flavour_name),
  Stuff_id int  foreign key references Stuff_info (Stuff_id),
  Quantity int,
  Bill float
  )

  create table Stuff_info
  (
  Stuff_id int  identity (1001,1) primary key, 
  stuff_name varchar(25) not null,
  stuff_email varchar(25) not null,
  stuff_password varchar (25) not null,
  stuff_birthday varchar (10),
  stuff_nationalid varchar (25),
  stuff_phonenumber varchar( 25) not null,
  stuff_address varchar (55)
  )
