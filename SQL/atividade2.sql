CREATE database tb_produtos;

use tb_produtos;

create table db_produtos(
id bigint auto_increment,

valor float not null,
tipo varchar(265) not null,
marca varchar(265) not null,
cor varchar (265)not null,
modelo varchar (265) not null,
primary key (id)
);

insert into db_produtos (valor,tipo,marca,cor,modelo) values (1000,"Tênis","Jordan","Vermelho e preto","Air jordan 1");
insert into db_produtos (valor,tipo,marca,cor,modelo) values (500,"Blusa","Adidas","Azul e preto","Old School");
insert into db_produtos (valor,tipo,marca,cor,modelo) values (600,"Tênis","Adidas","preto","Ozweego");
insert into db_produtos (valor,tipo,marca,cor,modelo) values (120,"Bone","New era","Azul escuro","NFL");
insert into db_produtos (valor,tipo,marca,cor,modelo) values (250,"Camisa","Champion","Vermelho e branco","Static");
insert into db_produtos (valor,tipo,marca,cor,modelo) values (500,"Tênis","Puma","Cinza e branco","RS X: Tech");
insert into db_produtos (valor,tipo,marca,cor,modelo) values (800,"Tênis","Jordan","Vermelho e cinza","Jordan Zoom 92");
insert into db_produtos (valor,tipo,marca,cor,modelo) values (50,"Camisa","oakley","Branca",".");

select * from db_produtos;

select * from db_produtos where valor > 500;

select * from db_produtos where valor < 500;

update db_produtos set db_produtos.valor = 300 where id = 5;