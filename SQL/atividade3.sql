CREATE database  if not exists db_escola;

use db_escola;

create table db_alunos
(
		id bigint auto_increment,
        nome varchar (265) not null,
        notaMatematica float not null,
        notaPortugues float not null,
        rg varchar (265) not null,
        genero char not null,
        primary key (id)
);


insert into db_alunos (nome,notaMatematica,notaPortugues,rg,genero) values ("João",7,9,"55555555",'M');
insert into db_alunos (nome,notaMatematica,notaPortugues,rg,genero) values ("Camila",10,10,"77777777",'F');
insert into db_alunos (nome,notaMatematica,notaPortugues,rg,genero) values ("Lukas",8,8,"100000000",'M');
insert into db_alunos (nome,notaMatematica,notaPortugues,rg,genero) values ("Lissandra",8,9,"4444444",'O');
insert into db_alunos (nome,notaMatematica,notaPortugues,rg,genero) values ("Robertoo",9,9,"88888888",'M');
insert into db_alunos (nome,notaMatematica,notaPortugues,rg,genero) values ("Jessica",8.5,10,"00000000",'F');
insert into db_alunos (nome,notaMatematica,notaPortugues,rg,genero) values ("Rodrigo",7,4,"33333333",'M');
insert into db_alunos (nome,notaMatematica,notaPortugues,rg,genero) values ("Manuel",5,4,"2222222222",'M');

select * from db_alunos;

select * from db_alunos where notaMatematica > 7 or notaPortugues > 7;

select * from db_alunos where notaMatematica < 7 or notaPortugues < 7;

update db_alunos set db_alunos.notaMatematica = 9.1 where id = 5;