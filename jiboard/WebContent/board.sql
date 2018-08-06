--CREATE TABLE board(
--	num number(5) primary key,
--	pass varchar2(30),
--	name varchar2(30),
--	email varchar2(30),
--	title varchar2(50),
--	content varchar2(1000),
--	read_count number(4) default 0,
--	write_date date default sysdate
--);

--create sequence board_seq start with 1 increment by 1;

--drop table board;

insert into board(num, name, email, pass, title, content) values(board_seq.nextval, '홍지상', 'wona23@gmail.com', '1357', '첫 게시글입니다.', '안녕하세요~');
insert into board(num, name, email, pass, title, content) values(board_seq.nextval, '권혜진', 'taya0111@naver.com', '2468', '둘째 게시글입니다.', '반갑습니다~');
commit;

select * from board;
select * from member;