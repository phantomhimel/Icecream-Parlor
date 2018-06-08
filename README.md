# Resources used 
<ul>
  <li> Java Graphical User Interface (SWING) </li>
  <li> Microsoft SQL Server </li>
  
  # DataBase and Table
  
  CREATE DATABASE Icecream_parlor
  <br><br><br>
  create table Product_table<br>
  (<br>
  Flavour_name varchar (25) not null primary key,<br><br>
  price float not null<br>
  )<br>
  <br><br><br>
  create table Selling_table<br>
  (<br>
  Flavour_name varchar (25) not null foreign key references Product_table( Flavour_name), <br>
  Stuff_id int  foreign key references Stuff_info (Stuff_id), <br>
  Quantity int,<br>
  Bill float<br>
  )<br>
<br><br><br>
  create table Stuff_info<br>
  (
  Stuff_id int  identity (1001,1) primary key, <br>
  stuff_name varchar(25) not null,<br>
  stuff_email varchar(25) not null,<br>
  stuff_password varchar (25) not null,<br>
  stuff_birthday varchar (10),<br>
  stuff_nationalid varchar (25),<br>
  stuff_phonenumber varchar( 25) not null, <br>
  stuff_address varchar (55)<br>
  )
