CREATE database db_atividade_rh;
use db_atividade_rh;

create table db_funcionarios1(
id bigint auto_increment,
nome varchar(255) not null,
idade int not null,
salario float not null,
ativo boolean not null,
genero char not null,
primary key(id)
);

insert into db_funcionarios1 (nome,idade,salario,ativo,genero) values ("eduardo",28,1900,true,'M');
insert into db_funcionarios1 (nome,idade,salario,ativo,genero) values ("Jennifer",19,7000,true,'F');

select * from db_funcionarios1;

select * from db_funcionarios1 where salario > 2000;

select * from db_funcionarios1 where salario < 2000;

update db_funcionarios1 set db_funcionarios1.nome= "João" where id = 1;





