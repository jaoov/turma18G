CREATE database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria
(
id bigint auto_increment,
remedios boolean not null,
outros boolean not null,
primary key (id)
);

create table tb_produto
(
id bigint auto_increment,
nome varchar (365) not null UNIQUE,
preco float not null,
tipo varchar (365) not null, 
categoria_id bigint,
primary key (id),
foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_categoria (remedios,outros) values (true,false);
insert into tb_categoria (remedios,outros) values (false,true);
insert into tb_categoria (remedios,outros) values (false,true);
insert into tb_categoria (remedios,outros) values (true,false);
insert into tb_categoria (remedios,outros) values (false,true);

insert into tb_produto (nome,preco,tipo,categoria_id) values ("Paracetamol",30,"Analgésico",1);
insert into tb_produto (nome,preco,tipo,categoria_id) values ("Energético Monster",7,"Analgésico",2);
insert into tb_produto (nome,preco,tipo,categoria_id) values ("Equipamento de medir pressão",120,"Equipamento",2);
insert into tb_produto (nome,preco,tipo,categoria_id) values ("Aspirina",55,"Analgésico",4);
insert into tb_produto (nome,preco,tipo,categoria_id) values ("Dipirona",25,"Analgésico",1);
insert into tb_produto (nome,preco,tipo,categoria_id) values ("Benzetacil",60,"Antibiotico",4);
insert into tb_produto (nome,preco,tipo,categoria_id) values ("Chocolate ",10,"Chocolate",2);
insert into tb_produto (nome,preco,tipo,categoria_id) values ("Penicilina",70,"Antibiótica",1);

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 6 and 60;

select * from tb_produto where nome like "%B%";

-- select * from tb_categoria inner join tb_pizza on tb_categoria.id = tb_pizza.categoria_id;
select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id;

select * from tb_categoria where remedios = true;

