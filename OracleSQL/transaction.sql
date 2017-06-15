drop table account;

create table account(
  ano varchar(20) primary key,
  aowner varchar(10) not null,
  abalance number not null
);

--Rollback(마지막 commit까지 되돌리기 = 현재 작업을 취소하기)--
insert into account values('111-111','홍길동',1000000);
insert into account values('222-222','스프링',0);
select * from account;
rollback;
select * from account;


--commit(현재 작업을 영구적으로 저장하기(반영하기)--
insert into account values('111-111','홍길동',1000000);
insert into account values('222-222','스프링',0);
select * from account;
commit;

--기능 단위의 Transaction 처리--
update account set abalance=abalance-10000 where ano='111-111';
update account set abalance=abalance+10000 where ano='222-223';
select * from account;
rollback;
select * from account;

