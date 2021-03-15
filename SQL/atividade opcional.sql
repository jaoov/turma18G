CREATE database db_nome_minha_casa_mais_bonita;

use db_nome_minha_casa_mais_bonita;

create table tb_categorias
(
id bigint auto_increment,
tipo varchar (265) not null UNIQUE,
moderno boolean not null,
retro boolean not null,
primary key (id)
);

create table tb_produto
(
id bigint auto_increment,
cor varchar (265) not null,
preco int not null,
quantidade int not null,
estoque boolean not null,
primary key (id),
categoria_id bigint,
foreign key (categoria_id) references tb_categorias(id)
);

create table tb_usuario
(
id bigint auto_increment,
nome varchar (265) not null UNIQUE,
email varchar (266) not null,
telefone varchar (265) not null,
senha varchar(265) not null,
ativo boolean not null,
primary key (id)
);
 insert into tb_categorias (tipo,moderno,retro) values ("Eletrodomestico",true,false);
 insert into tb_categorias (tipo,moderno,retro) values ("Sofa",true,false);
 insert into tb_categorias (tipo,moderno,retro) values ("Bicicleta",false,true);
 insert into tb_categorias (tipo,moderno,retro) values ("Cadeira gamer",true,false);
 insert into tb_categorias (tipo,moderno,retro) values ("Criado mudo",false,true);
 
insert into tb_produto (cor,preco,quantidade,estoque,categoria_id) values ("Vermelho",2000,3,true,2);
insert into tb_produto (cor,preco,quantidade,estoque,categoria_id) values ("preto",1000,3,true,3);
insert into tb_produto (cor,preco,quantidade,estoque,categoria_id) values ("Cinza",120,0,false,1);
insert into tb_produto (cor,preco,quantidade,estoque,categoria_id) values ("Amarelo",40,3,true,1);
insert into tb_produto (cor,preco,quantidade,estoque,categoria_id) values ("Azul",699,3,true,4);
insert into tb_produto (cor,preco,quantidade,estoque,categoria_id) values ("Verde",30,3,true,1);
insert into tb_produto (cor,preco,quantidade,estoque,categoria_id) values ("Preto",200,3,true,5);

insert into tb_usuario (nome,email,telefone,senha,ativo) values ("Rami","Rami03@gmail.com","1199999999","1234",true);
insert into tb_usuario (nome,email,telefone,senha,ativo) values ("Jake","Jake2000@gmail.com","117777777","2345",true);
insert into tb_usuario (nome,email,telefone,senha,ativo) values ("Nico","Nica12@gmail.com","11888888888","3333",true);
insert into tb_usuario (nome,email,telefone,senha,ativo) values ("Diego","diegao@gmail.com","1145555555","5555",true);
insert into tb_usuario (nome,email,telefone,senha,ativo) values ("Karina","Karis@gmail.com","11666666666","8901",true);

select * from tb_produto;

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_categorias where tipo like "%B%";

select * from tb_categorias where tipo like "%C%";

 -- select * from tb_categoria inner join tb_pizza on tb_categoria.id = tb_pizza.categoria_id;
 select * from tb_categorias inner join tb_produto on tb_categorias.id = tb_produto.categoria_id;
 
select avg (preco) from tb_produto;

select sum(preco) AS total from tb_produto;

select count(*) from tb_produto;

select * from tb_produto where categoria_id = 1;


