drop table account;

create table account(
  ano varchar(20) primary key,
  aowner varchar(10) not null,
  abalance number not null
);

--Rollback(������ commit���� �ǵ����� = ���� �۾��� ����ϱ�)--
insert into account values('111-111','ȫ�浿',1000000);
insert into account values('222-222','������',0);
select * from account;
rollback;
select * from account;


--commit(���� �۾��� ���������� �����ϱ�(�ݿ��ϱ�)--
insert into account values('111-111','ȫ�浿',1000000);
insert into account values('222-222','������',0);
select * from account;
commit;

--��� ������ Transaction ó��--
update account set abalance=abalance-10000 where ano='111-111';
update account set abalance=abalance+10000 where ano='222-223';
select * from account;
rollback;
select * from account;

