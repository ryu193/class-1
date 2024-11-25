select * from emp;

desc emp;

select * from dept;

desc dept;

desc salgrade;

select * from salgrade;

select empno,ename,deptno from emp;

select empno,
       ename,
       SAL 
from   emp;

SELECT DEPTNO
FROM EMP;

SELECT DISTINCT DEPTNO FROM EMP;

SELECT DISTINCT JOB FROM EMP;
/*범위주석
아무거나 (여기다가 메모가능)
심지어 여러줄*/
SELECT DISTINCT JOB,DEPTNO FROM EMP; 

SELECT ENAME,SAL,SAL*12+COMM,COMM FROM EMP;

SELECT ENAME,SAL,SAL*12+COMM AS 연봉,COMM FROM EMP;/* AS를 적지않아도 별칭등록(연봉)
가능*/
SELECT SAL*12+COMM 연봉 FROM EMP;

SELECT * FROM EMP
ORDER BY SAL DESC;

SELECT ENAME,SAL,SAL*12+COMM 연봉 FROM EMP
ORDER BY 연봉 ASC;

SELECT * FROM EMP
ORDER BY ENAME ASC;

SELECT * FROM EMP
ORDER BY JOB ASC;

SELECT * FROM EMP
ORDER BY JOB,SAL ASC;

SELECT * FROM EMP
ORDER BY EMPNO DESC,JOB,SAL ASC; /*오더바이뒤에 적은순서대로 고려함*/
--P.92
--Q2
SELECT DISTINCT JOB FROM EMP;

--Q3
SELECT EMPNO AS EMPNO_NO,ENAME AS EMPLOYEE_NAME,
MGR AS MANAGER,SAL AS SALARY,
COMM AS COMMISSION,DEPTNO AS DEPARTMENT FROM EMP
ORDER BY EMPNO DESC,ENAME; 


SELECT * FROM EMP
WHERE DEPTNO=30 ORDER BY SAL;

SELECT * FROM EMP WHERE EMPNO=7782;

SELECT * FROM EMP
WHERE DEPTNO=30 AND JOB='SALESMAN';

SELECT * FROM EMP
WHERE DEPTNO=30 OR JOB='CLERK';


--P.98 복습
SELECT * FROM EMP WHERE EMPNO=7499 AND DEPTNO=30;


--P.99 복습
SELECT * FROM EMP WHERE DEPTNO=20 OR JOB='SALESMAN';

--연습문제
SELECT * FROM EMP WHERE ENAME='WARD'
OR JOB='CLERK'
OR DEPTNO=20;


SELECT * FROM EMP WHERE ENAME='WARD'
OR JOB='CLERK'
AND DEPTNO=20;
--아래는 괄호를 채워도 위와 같은값
SELECT * FROM EMP WHERE ENAME='WARD'
OR (JOB='CLERK'
AND DEPTNO=20);
 
 /*괄호의 위치를 바꿔주면 값이 바뀜 괄호의 위치때문에 
사원이름이 와드거나 직업이클럭인 사람중에 부서번호가 20번인사람으로 바뀌었기때문*/
SELECT * FROM EMP WHERE (ENAME='WARD'
OR JOB='CLERK')
AND DEPTNO=20;

SELECT * FROM EMP 
WHERE SAL*12=36000;

SELECT * FROM EMP
WHERE SAL>=3000;

SELECT * FROM EMP
WHERE SAL>3000;


SELECT * FROM EMP
WHERE SAL<=2000
ORDER BY SAL;



--P.102 복습
SELECT * FROM EMP 
WHERE SAL >=2500 AND JOB='ANALYST';

--급여가 2000이상 3000미만인 사람
select * from emp
where sal>=2000 and sal<3000;

--아래 두가지 셀렉문은 같은 말이다 급여가 3000이 아닌사람.
select * from emp
where sal!=3000;

select * from emp
where sal<>3000;




select * from emp
where deptno<>20
order by deptno desc;


select * from emp
where deptno<>20;

select * from emp
where deptno<>20 and deptno<>10;

select * from emp
where deptno=30 and sal<=2000;

--급여가 3000이 아닌사람
select * from emp
where not sal =3000;

--부정의 부정은 긍정이므로 아래 셀렉문은 급여가 3000인사람이나옴
select * from emp
where not sal<>3000;

--2000미만 또는 3000이상 출력
select * from emp
where sal<2000 or sal>=3000;
--2000이상 그리고 3000미만이 아닌것 출력
select * from emp
where not
(sal>=2000 and sal<3000);
/*분배법칙처럼 not뒤에 (sal>=2000 and sal<3000) 이부분을
전부 부정하면 '이상'은 '미만' '그리고'는 '또는' 미만은 이상으로 바꿔주면된다 */

/* 아래 두가지 셀렉문은 같은값을 출력한다
or을 사용하던가 in을활용하여*/

select * FROM EMP
WHERE JOB='MANAGER'OR JOB='SALESMAN' OR JOB='CLERK';

SELECT * FROM EMP
WHERE JOB IN ('MANAGER','SALESMAN','CLERK') ;
--두가지의 같은 셀렉문

--아래는 윗두가지를 부정한 두가지 같은 셀렉문
select * FROM EMP
WHERE not (JOB='MANAGER'OR JOB='SALESMAN' OR JOB='CLERK');

SELECT * FROM EMP
WHERE JOB NOT IN ('MANAGER','SALESMAN','CLERK') ;

--.


SELECT * FROM EMP
WHERE DEPTNO IN (10,20)
ORDER BY DEPTNO DESC,
SAL DESC;

SELECT * FROM EMP
WHERE DEPTNO NOT IN (10,20)
ORDER BY SAL DESC;

SELECT * FROM EMP
WHERE DEPTNO = 20
  AND SAL >= 1000;
  
--CHAT GPT가 만들어준쿼리 
/*SAL(월급)에 12를 곱해 연봉을 계산하고,
COMM(커미션)이 있는 경우 커미션을 더해서 연봉을 계산하는 쿼리는 다음과 같습니다. 
COMM 값이 NULL인 경우에는 SAL * 12만 연봉으로 설정하도록 했습니다.*/

SELECT EMPNO, ENAME, DEPTNO, SAL, COMM,
       SAL * 12 + NVL(COMM, 0) AS ANNUAL_SALARY
FROM EMP;


SELECT * FROM EMP
WHERE SAL BETWEEN 2000 AND 3000
ORDER BY SAL DESC;


SELECT * FROM EMP
WHERE SAL NOT BETWEEN 2000 AND 3000
ORDER BY SAL DESC;


-- 이름(ENAME)이 'S'로 시작하는 직원들을 조회합니다.
SELECT * FROM EMP
WHERE ENAME LIKE 'S%';

--이름의 두 번째 글자가 'L'인 직원들을 조회합니다
SELECT * FROM EMP
WHERE ENAME LIKE '_L%';


SELECT * FROM EMP 
WHERE ENAME NOT LIKE'____'; 

SELECT * FROM EMP
WHERE ENAME NOT LIKE '%AM%';



-- 직원 이름(ENAME)이 'A%A' 형식인 데이터를 조회합니다.
-- 이 쿼리는 '%'를 와일드카드가 아닌 문자로 인식하게 하기 위해 
-- 'ESCAPE' 절을 사용하여 '\'를 와일드카드 문자 '%' 앞에 추가합니다
SELECT * FROM EMP
WHERE ENAME LIKE 'A\%A' ESCAPE '\';
/*LIKE 'A%A': 일반적으로 '%'는 와일드카드로 사용되지만
ESCAPE '' 절을 사용하여 '%'를 문자로 처리하도록 설정합니다.
즉, 이름이 **'A%A'**인 직원들을 찾고자 할 때 사용됩니다.

ESCAPE '': 이 절은 뒤따르는 문자가 
와일드카드 문자가 아니라 일반 문자임을 명시하는 역할을 합니다.*/


--NULL은 조회가 안된다
SELECT * FROM EMP
WHERE COMM <=400;
--NULL만 조회하기
SELECT * FROM EMP
WHERE COMM IS NULL;

SELECT * FROM EMP
WHERE COMM IS NOT NULL;

SELECT COMM AS "커미션", COMM + 10 AS "커미션+10" FROM EMP;

SELECT * FROM EMP 
WHERE MGR IS NULL;


SELECT EMPNO,ENAME,SAL,DEPTNO
FROM EMP
WHERE DEPTNO = 10
UNION
SELECT EMPNO,ENAME,SAL
FROM EMP
WHERE DEPTNO = 20;

SELECT EMPNO,ENAME,SAL,DEPTNO
FROM EMP
WHERE DEPTNO = 10
UNION
SELECT EMPNO,ENAME,SAL,DEPTNO
FROM EMP
WHERE DEPTNO = 20;

/*EMPNO와 ENAME의 위치를 바꿈
숫자,문자*/
SELECT EMPNO,ENAME,SAL,DEPTNO
FROM EMP
WHERE DEPTNO = 10
UNION
SELECT ENAME,EMPNO,SAL,DEPTNO
FROM EMP
WHERE DEPTNO = 20;

--타입이 같다면 괜찮
--컬럼에 의미는 신경쓰지않는다
SELECT EMPNO,ENAME,SAL,DEPTNO
FROM EMP
WHERE DEPTNO = 10
UNION
SELECT SAL,ENAME,SAL,DEPTNO
FROM EMP
WHERE DEPTNO = 20;



SELECT EMPNO,ENAME,SAL,DEPTNO
FROM EMP
WHERE DEPTNO = 10
UNION
SELECT EMPNO,ENAME,SAL,DEPTNO
FROM EMP
WHERE DEPTNO = 10;

/*UNION ALL 중복에 관계없이 모든줄을 표시*/
SELECT EMPNO,ENAME,SAL,DEPTNO
FROM EMP
WHERE DEPTNO = 10
UNION ALL
SELECT EMPNO,ENAME,SAL,DEPTNO
FROM EMP
WHERE DEPTNO = 10;

--Q1
SELECT * FROM EMP
WHERE ENAME LIKE '%S';
--Q2
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO
FROM EMP
WHERE DEPTNO = 30
  AND JOB = 'SALESMAN';
--Q3
SELECT EMPNO, ENAME, SAL, DEPTNO
FROM EMP
WHERE DEPTNO IN (20, 30)
  AND SAL > 2000;
  


--Q4
SELECT * FROM EMP
WHERE NOT (2000<=SAL AND 3000<=SAL);

--Q5
SELECT ENAME,EMPNO,SAL,DEPTNO FROM EMP
WHERE ENAME LIKE '%E%'
AND DEPTNO=30
AND SAL NOT BETWEEN 1000 AND 2000;

--Q6
SELECT * FROM EMP
WHERE COMM IS NULL
AND MGR IS NOT NULL
AND JOB IN ('MANAGER','CLERK')
AND ENAME NOT LIKE '_L%';

--P.125~126

SELECT * FROM DUAL;

SELECT UPPER('asDcdE') FROM DUAL;

SELECT LOWER('asDcdE') FROM DUAL;


SELECT LOWER(ENAME) FROM EMP;
SELECT UPPER(ENAME) FROM EMP;

SELECT UPPER(LOWER(ENAME)) FROM EMP;

SELECT * FROM EMP
where
ENAME LIKE '%A%' OR ENAME LIKE '%a%';

SELECT * FROM EMP
where lower(ename) 
like '%a%';

select ename , length(ename)as 길이 from emp;

select length ('abc'),length('한글') from dual;

select ename, length(ename)
from emp
where length(ename)>=5;

select length('한'),lengthb('한') from dual;


