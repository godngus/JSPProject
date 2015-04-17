--1)데이터 정의 언어(DDL):create,alter,drop
--2)데이터 조작 언어(DML):insert,update,delete,select
--3)데이터 제어 언어(DCL):grant,revoke

create table member(
name char(4) primary key,
USERID varchar(10),
PWD    varchar(10),
EMAIL  varchar(12),
phone  varchar(15),
ADMIN  int

);

select * from member;
