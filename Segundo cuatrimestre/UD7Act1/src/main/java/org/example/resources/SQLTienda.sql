drop database if exists Tienda; 
create database Tienda;
use Tienda;

drop table if exists productos,
						tipos;


create table tipos(
		idTipo int auto_increment,
		tipo varchar (50),
        
        primary key (idtipo)
);

create table productos(
		id int auto_increment,
        referencia varchar (20),
        nombre varchar (30),
        descripcion varchar (100),
        tipo int,
        cantida int,
        precio double,
        descuento int,
        iva int, 
        aplicarDto boolean,
        
        primary key (id),
        foreign key (tipo) references tipos (idTipo)
);



select * from tipos

