create schema if not exists empresa;
create table pessoa (
    id INT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INT,
    sexo VARCHAR(10)
);
create table detalhes (
    id INT PRIMARY KEY,
    altura DECIMAL(5, 2),
    peso DECIMAL(5, 2),
    FOREIGN KEY (id) REFERENCES pessoa(id)
);

insert into pessoa (id, nome, idade, sexo) values(1, 'Sose Soares', 45, 'Masculino'),(2, 'Maria Santos', 21, 'Feminino');

insert into detalhes (id, altura, peso) values(1, 1.80, 90.2),(2, 1.72, 67.9);

select * from pessoa order by idade desc;

select sexo,  count(*) as Total
from pessoa
group by sexo;

select sexo, avg(idade) as Media
from pessoa
where idade > 30
group by sexo;







