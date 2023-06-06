USE Stu_management
create table Grade  
(  
	 Grade decimal(5) not null,   
	GPA decimal(5) not null ,   
	STUID varchar (30) not null ,   
	Score int not null,
	Class_name varchar (20) not null,
	Student_name varchar (6) not null,
	Teacher_name varchar (6) not null,
	Syear varchar (20) not null,
	Term int not null,
	CID varchar (30) primary key,
	Pass int not null
)
create table Course  
(  
	Course_name varchar (20) not null ,   
	Teacher_name varchar (6) not null,   
	TID varchar (30) not null, --不能为空not null-- 
	Students_num int not null,
	CID varchar (30) not null primary key
)  
create table Student  
(  
	Student_name varchar (6) , --主键的关键字primary key--  
	STUID varchar (30) primary key not null, --唯一索引关键字unique--  
	Address varchar (50), --不能为空not null--  
	Tel varchar (20),
	Dorm varchar (30),
	sex char(2),
	IDclass varchar (2),
	IDnum varchar (30),
	Stu_year int ,
	Major varchar (20),
	Class_name varchar (20)
)  
create table Operators 
(  
	AID varchar (30) primary key , --主键的关键字primary key--  
	Admin_name varchar  (30) unique not null, --唯一索引关键字unique--  
	Admin_privilege int not null , --不能为空not null--   
)  
