create database test;
use test;
create table persona(
id_persona int(11)auto_increment,
nombre varchar(50),
apellido varchar(50),
email varchar(50),
telefono varchar(50),
primary key(id_persona)
);

create table usuario(
id_usuario int(11)auto_increment,
id_persona int (11),
username varchar(45),
password varchar(45),
primary key(id_usuario)
);

insert into persona values(1,"jonathan","camaño","jonathan@email.com","3199787");

alter table usuario
add constraint "fk_persona" foreign key(id_persona) references persona(id_persona) on delete set null on update restrict;

insert into usuario values(null,1,"bazuco28","madao");


