CREATE database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria 
(
id bigint auto_increment,
bovino boolean not null,
suino boolean not null,
outros boolean not null,
primary key (id)
);

create table tb_produto
(
id bigint auto_increment,
nome varchar (265) not null UNIQUE,
preco float not null,
categoria_id bigint,
primary key (id),
FOREIGN key (categoria_id) references tb_categoria(id)
);

insert into tb_categoria (bovino,suino,outros) values (true,false,false);
insert into tb_categoria (bovino,suino,outros) values (false,true,false);
insert into tb_categoria (bovino,suino,outros) values (false,false,true);
insert into tb_categoria (bovino,suino,outros) values (false,false,true);
insert into tb_categoria (bovino,suino,outros) values (true,false,false);

insert into tb_produto (nome,preco,categoria_id) values ("Asa",60,3);
insert into tb_produto (nome,preco,categoria_id) values ("Picanha",100,1);
insert into tb_produto (nome,preco,categoria_id) values ("Cupim",70,1);
insert into tb_produto (nome,preco,categoria_id) values ("Linguiça",45,2);
insert into tb_produto (nome,preco,categoria_id) values ("Contrafile",80,1);
insert into tb_produto (nome,preco,categoria_id) values ("File de frango",55,2);
insert into tb_produto (nome,preco,categoria_id) values ("Salsicha",30,3);
insert into tb_produto (nome,preco,categoria_id) values ("Coxa",90,3);

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like "%C%";

select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id;

select * from tb_categoria where bovino = true;

 




