drop database if exists Tienda; 
create database Tienda;
use Tienda;

drop table if exists productos,
						tipos;


create table tipos(
		idTipo int auto_increment,
		tipo varchar (50) not null,
        
        primary key (idtipo)
);

create table productos(
		id int auto_increment unique,
        referencia varchar (20) not null,
        nombre varchar (30) not null,
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


INSERT INTO tipos (tipo) VALUES ('Alimentación'), ('Electrónica'), ('Hogar'),
('Fruta y Verdura'), ('Lácteos'), ('Limpieza'), ('Panadería');

-- Insertando productos variados
INSERT INTO productos (referencia, nombre, descripcion, tipo, cantida, precio, descuento, iva, aplicarDto) 
VALUES 
('REF-001', 'Manzana Fuji', 'Manzanas dulces de importación', 1, 150, 2.50, 0, 4, FALSE),
('REF-002', 'Leche Entera 1L', 'Pack de 6 briks de leche entera', 5, 40, 5.80, 10, 4, TRUE),
('REF-003', 'Detergente Líquido', 'Jabón para ropa delicada 2L', 6, 25, 12.95, 5, 21, FALSE),
('REF-004', 'Auriculares Bluetooth', 'Cancelación de ruido activa', 2, 10, 89.99, 15, 21, TRUE),
('REF-005', 'Barra de Pan', 'Pan artesano recién horneado', 1, 100, 0.60, 0, 4, FALSE),
('REF-006', 'Yogur Griego Natural', 'Pack de 4 unidades sin azúcar', 5, 60, 1.95, 0, 10, FALSE);


Select p.nombre, p.tipo, t.tipo
from productos p
join tipos t on t.idTipo = p.tipo
