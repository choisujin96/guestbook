
-- ----------------------------------------------------
# guestbook 계정에서 실행
-- ----------------------------------------------------
-- db 선택
use guestbook_db;

create table guestbook(
	no         int    primary key  auto_increment,
    name   varchar(80),
    password  varchar(20),
    content  text,
    reg_date  datetime
);

-- 테이블 삭제
drop table guestbook;

select *
from guestbook;

select 	no
			,name
            ,password
            ,content
			,reg_date
from guestbook;


insert into guestbook
values(null, '이효리', '000', '방가방가 햄토리^ㅠ^',now());

insert into guestbook
values(null, '유재석', '111', '안녕하세요^^ 유재석입니다.',now());

insert into guestbook
values(null, '울랄라', '111', '니난농니나농',now());

delete from guestbook
where no = 6;


delete from guestbook
where no = '1'
and password = '000' ;