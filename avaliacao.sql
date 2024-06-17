create database avaliacaoJeiel;
use avaliacaoJeiel;

create table usuario (
	IDUSUARIO int auto_increment primary key,
    USUARIO varchar(50) not null,
    SENHA varchar(16) not null,
    DATACAD timestamp default current_timestamp
);

insert into usuario (USUARIO, SENHA) values ("admin", "12345");
insert into usuario (USUARIO, SENHA) values ("jeiel", "root");

create table veiculo (
	IDVEICULO int auto_increment primary key,
    MARCA varchar(100) not null,
    MODELO varchar(100) not null,
    ANOFABRICACAO int not null,
    PLACA varchar(7) not null,
    COR varchar(30) not null,
    TIPO varchar(30) not null,
    DATACAD timestamp default current_timestamp
);

select * from usuario;
select * from veiculo;