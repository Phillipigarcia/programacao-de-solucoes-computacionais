create schema if not exists oficina;
use oficina;
create table if not exists cliente (
cpf int auto_increment primary key, nome varchar(128), data_nascimento date, telefone varchar(15), endereco varchar(100)
);
create table if not exists veiculo (
chassi int auto_increment primary key, placa varchar(15), modelo varchar(56), marca varchar(56), ano date
);
create table if not exists mecanico (
cpf int auto_increment primary key, nome varchar(128), data_nascimento date, telefone varchar(15), endereco varchar(100), salario double
);
select * from cliente;

insert into cliente (nome, data_nascimento, telefone, endereco) values ('Jose Soares', '1997-09-07', '(31)989864564',
'Rua Alvorada, 789');

select * from cliente where id = '1';

update cliente set endereco = 'Rua Almeida, 798' where id = 1;

delete from cliente where id = 1;