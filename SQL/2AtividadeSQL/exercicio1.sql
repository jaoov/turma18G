CREATE database db_generation_game_online;

use db_generation_game_online;

create table tb_classes
(
id bigint auto_increment,
nomeClasse varchar (265) not null UNIQUE,
defesa varchar (265) not null,
poder varchar (265) not null,
primary key (id)
);

insert into tb_classes (nomeClasse,defesa,poder) values ("Elfo","1000","3000");
insert into tb_classes (nomeClasse,defesa,poder) values ("Draconico","1100","3500");
insert into tb_classes (nomeClasse,defesa,poder) values ("Barbaro","4000","2500");
insert into tb_classes (nomeClasse,defesa,poder) values ("Bruxo","1500","3600");
insert into tb_classes (nomeClasse,defesa,poder) values ("Monge","1100","3400");


create table tb_personagens 
(
id bigint auto_increment,
nomePersonagem varchar (265) not null UNIQUE,
idade int not null,
arma varchar (265) not null,
nivel int not null,
primary key (id),
classe_id bigint,
FOREIGN key (classe_id) REFERENCES tb_classes (id)
);


insert into tb_personagens (nomePersonagem,idade,arma,nivel,classe_id) values ("Atreus",20,"Espada",10,2);
insert into tb_personagens (nomePersonagem,idade,arma,nivel,classe_id) values ("Carina",18,"Arco",10,1);
insert into tb_personagens (nomePersonagem,idade,arma,nivel,classe_id) values ("Aquiles",30,"Machado",10,3);
insert into tb_personagens (nomePersonagem,idade,arma,nivel,classe_id) values ("Avatar",25,"Soco inglês",10,5);
insert into tb_personagens (nomePersonagem,idade,arma,nivel,classe_id) values ("Morgana",15,"Adaga",10,4);
insert into tb_personagens (nomePersonagem,idade,arma,nivel,classe_id) values ("Jorjão",45,"Escudo",10,3);
insert into tb_personagens (nomePersonagem,idade,arma,nivel,classe_id) values ("Lazaro",29,"Lança",10,2);
insert into tb_personagens (nomePersonagem,idade,arma,nivel,classe_id) values ("Fiona",32,"Cutelo",10,3);

select * from tb_personagens;
	
    select * from tb_personagens
		inner join tb_classes where poder > 2000;
        
     select * from tb_personagens
		inner join tb_classes where defesa between 1000 and 2000;
        
		select * from tb_personagens where nomePersonagem like "%C%";
        
		select * from tb_personagens where classe_id = 2;
        
        