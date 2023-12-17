
insert into filial values
('04.123.456/0404-88', 'Nova Lima', '+55 (31) 9 7654-3210', 'Rua 7, n. 7, Centro'),
('05.654.789/0505-99', 'Sabará', '+55 (31) 9 8765-4321', 'Rua 8, n. 8, Industrial');

insert into produto values
(10, 4, 'arroz', 14.99, '2023-11-30'), 
(11, 5, 'feijão', 9.99, '2023-12-31');

insert into estoque values
(8, '04.123.456/0404-88', 15), 
(11, '05.654.789/0505-99', 20);

select f.cnpj as cnpj_filial, f.nome as nome_filial, sum(p.preco * e.quantidade) as soma
from filial f join estoque e on f.cnpj = e.cnpj_filial join produto p on e.id_produto = p.id
group by f.cnpj, f.nome
having soma > 10000;
