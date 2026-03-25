drop database if exists Animal_Shelter;
create database Animal_Shelter;
use Animal_Shelter;

drop table if exists staff,
					 adopters,
                     animal_species,
                     animals,
                     adoptions;

create table staff(
	staff_id int auto_increment,
    birth_date date not null,
    first_name varchar (20) not null,
    last_name varchar (40) not null,
    hire_date date not null,
    work_role enum ('veterinario', 'auxiliar' ,'administrador', 'cuidador'),
    
    primary key (staff_id)
);

create table adopters(
	dni varchar (9),
    adopter_id int auto_increment,
    birth_date date not null,
    first_name varchar (20) not null,
    last_name varchar (40) not null,
    phone varchar (9),
    email varchar (100),
    
    primary key (adopter_id)
);


create table animal_species(
	species_id int auto_increment,
    species varchar (20),
    
    primary key (species_id)
);


create table animals(
	animal_id int auto_increment not null,
    pet_name varchar (20) not null,
    species int,
    age int,
    gender enum ('F','M'),
    arrival_date date,
    caretaker int,
    
    primary key (animal_id),
    foreign key (species) references animal_species(species_id),
	foreign key (caretaker) references staff(staff_id)
);

create table adoptions(
	adoption_id int auto_increment not null,
    animal_id int,
    adopter_id int,
    adoption_date date,
    staff_id int,
    
    primary key (adoption_id),
	foreign key (animal_id) references animals(animal_id),
	foreign key (adopter_id) references adopters(adopter_id),
	foreign key (staff_id) references staff(staff_id)

);



INSERT INTO staff (birth_date, first_name, last_name, hire_date, work_role) VALUES
('1985-03-12', 'Ana', 'García', '2020-06-01', 'veterinario'),
('1990-07-25', 'Luis', 'Martínez', '2021-02-15', 'cuidador'),
('1988-11-05', 'Marta', 'López', '2019-09-10', 'administrador'),
('1995-01-20', 'Carlos', 'Sánchez', '2022-03-05', 'auxiliar');


INSERT INTO adopters (dni, birth_date, first_name, last_name, phone, email) VALUES
('12345678A', '1992-05-14', 'Juan', 'Pérez', '600123456', 'juan@email.com'), 
('87654321B', '1987-08-22', 'Laura', 'Gómez', '611987654', 'laura@email.com'),
('11223344C', '1995-12-01', 'Pedro', 'Ruiz', '622334455', 'pedro@email.com'),
('44332211D', '1990-03-30', 'Lucía', 'Fernández', '633221144', 'lucia@email.com');

INSERT INTO animal_species (species) VALUES ('Perro'), ('Gato'), ('Conejo'), ('Ave');

INSERT INTO animals (pet_name, species, age, gender, arrival_date, caretaker) VALUES
('Max', 1, 3, 'M', '2025-01-10', 2), ('Luna', 2, 2, 'F', '2025-02-15', 2),
('Rocky', 1, 5, 'M', '2025-03-01', 4), ('Mimi', 2, 1, 'F', '2025-03-20', 4), 
('Bunny', 3, 2, 'F', '2025-02-05', 2);

INSERT INTO adoptions (animal_id, adopter_id, adoption_date, staff_id) VALUES
(1, 1, '2025-04-01', 3), (2, 2, '2025-04-03', 3), (5, 4, '2025-04-10', 1);



select an.pet_name, s.species, an.age










