create table board(
num number primary key,
name varchar2(10),
title varchar2(100),
content varchar2(1000),
hits number  default 0,
wdate date   default sysdate,
attachment varchar2(50)--첨부파일 
);
--시퀀스 생성
create sequence board_seq;
insert into board values(board_seq.nextval,'아','제','시','1',default,'이');
select *from board;
