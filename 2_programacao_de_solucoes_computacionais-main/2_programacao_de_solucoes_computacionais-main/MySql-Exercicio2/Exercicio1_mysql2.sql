create schema if not exists escola;
use escola;
create table if not exists aluno (
matricula int auto_increment primary key, cpf varchar(15), nome varchar(128), data_nascimento date, telefone varchar(15), endereco varchar(100)
);
create table if not exists curso (
id int auto_increment primary key, nome varchar(128), descricao varchar(120), valor_mensalidade double, data_criacao date
);
create table if not exists unidade (
id int auto_increment primary key, nome varchar(128), descricao varchar(120), data_inicio date, data_termino date, carga int
);
select * from curso;

insert into curso (nome, descricao, valor_mensalidade, data_criacao) values ('analise e desenvolvimento de sistemas', 'estudam os diversos sistemas existentes entre hardwares, softwares e o usuário final', 908.7,
'1977-04-17');

select * from curso where id = '1';

update curso set valor_mensalidade = 690 where id = 1;

delete from curso where id = 1;
