create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
tipo_piz varchar(30) not null,
tamanho_piz varchar(30) not null,
primary key(id)
);

create table tb_pizza(
id bigint auto_increment,
nome_piz varchar(30) not null,
ingredientes varchar(60) not null,
preco_piz decimal not null,
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_categoria (tipo_piz, tamanho_piz) values ("Pizza doce","Broto"),
("Pizza Salgada","Grande"),
("Pizza Salgada","Broto"),
("Pizza doce","Grande"),
("Pizza Salgada","Broto");

insert into tb_pizza (nome_piz, ingredientes, preco_piz, categoria_id) values ("Calabreza", "Mussarela, Calabreza",99.99,2),
("Nutella", "Nutella, Pedaços de chocolate",60,1),("4 queijos", "Mussarela, Parmesão, Gorgonzola, Provolone", 82.90,2),
("Chocolate Branco", "Chocolate Branco",50,1),("Frango com Catupiry", "Frango, Catupiry",70,2),("Catupiry", "Mussarela, Catupiry",40,3),
("Big Nutella", "Nutella, Pedaços de chocolate",110.10,4),
("Mini Mussarela", "Mussarela",30,5);

select * from tb_pizza 
where preco_piz > 45;

select * from tb_pizza 
where preco_piz between 29 and 60;

select * from tb_pizza 
where nome_piz like "%C%";

select * from tb_categoria inner join tb_pizza on tb_categoria.id = tb_pizza.categoria_id;

select * from tb_categoria inner join tb_pizza on tb_categoria.id = tb_pizza.categoria_id
where tb_categoria.tipo_piz = "Pizza doce";


