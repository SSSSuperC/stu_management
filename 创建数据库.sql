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
	TID varchar (30) not null, --����Ϊ��not null-- 
	Students_num int not null,
	CID varchar (30) not null primary key
)  
create table Student  
(  
	Student_name varchar (6) , --�����Ĺؼ���primary key--  
	STUID varchar (30) primary key not null, --Ψһ�����ؼ���unique--  
	Address varchar (50), --����Ϊ��not null--  
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
	AID varchar (30) primary key , --�����Ĺؼ���primary key--  
	Admin_name varchar  (30) unique not null, --Ψһ�����ؼ���unique--  
	Admin_privilege int not null , --����Ϊ��not null--   
)  
