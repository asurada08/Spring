create sequence seq_dept start with 10 nocache increment by 10;
create sequence seq_emp start with 1 nocache increment by 1;

create table t_dept(
	deptno number primary key,
	dname varchar2(20) not null
);



create table t_emp(
	empno number,
	ename varchar2(20) not null,
	sal   number not null,
	deptno number,
	primary key(empno)
);

alter table t_emp
add foreign key (deptno) references t_dept (deptno);



insert into T_DEPT(deptno, dname)
values(seq_dept.nextval, 'executive');
insert into T_DEPT(deptno, dname)
values(seq_dept.nextval, 'sales');
insert into T_DEPT(deptno, dname)
values(seq_dept.nextval, 'development');

insert into T_EMP(empno, ename, sal, deptno)
values(seq_emp.nextval, 'suji', 100, '10');
insert into T_EMP(empno, ename, sal, deptno)
values(seq_emp.nextval, 'haechul', 200, '30');
insert into T_EMP(empno, ename, sal, deptno)
values(seq_emp.nextval, 'yuna', 400, '20');


select *
from T_DEPT;

select *
from T_EMP;

select a.empno, a.ename, a.sal, a.deptno, b.dname
from t_emp a
    ,T_DEPT b
where a.deptno = b.deptno
order by a.empno;


select sum(sal) from t_emp;

