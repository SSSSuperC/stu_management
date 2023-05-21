USE Stu_management
create table Grade  
(  
	 Grade decimal(5) not null,   
	GPA decimal(5) not null ,   
	STUID varchar not null ,   
	Score int not null,
	Class_name varchar not null,
	Srudent_name varchar not null,
	Teacher_name varchar not null,
	Syear varchar not null,
	Term int not null,
	CID varchar primary key,
	Pass int not null
)
create table Course  
(  
	Course_name varchar not null ,   
	Teacher_name varchar not null,   
	TID varchar not null, --不能为空not null-- 
	Students_num int not null,
	CID varchar not null primary key
)  
create table Student  
(  
	Student_name varchar , --主键的关键字primary key--  
	STUID varchar primary key not null, --唯一索引关键字unique--  
	Address varchar , --不能为空not null--  
	Tel varchar,
	Dorm varchar,
	sex char(2),
	IDclass varchar,
	IDnum varchar,
	Stu_year int,
	Major varchar,
	Class_name varchar
)  
create table Operators 
(  
	AID varchar primary key , --主键的关键字primary key--  
	Admin_name varchar unique not null, --唯一索引关键字unique--  
	Admin_privilege int not null , --不能为空not null--   
)  
