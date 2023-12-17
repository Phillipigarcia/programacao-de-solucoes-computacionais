insert into filial values
('01.678.277/0109-87', 'Barreiro', '+55 (31) 9 8749-6421', 'Rua 4, n. 4, Barreiro'), 
('02.876.722/0202-55', 'Contagem', '+55 (31) 9 5432-1001', 'Rua 5, n. 5, Industrial'),
('03.987.311/0302-45', 'Betim', '+55 (31) 9 6789-0220', 'Rua 6, n. 6, Alterosas');

insert into fornecedor values
(1, 'Doravante S.A.', '+55 (31)9 9743-6521', 'Rua Parque do Sol'), 
(2, 'Trajos LTDA', '+55 (21)9 9873-2955', 'Rua Pedra de Guaratiba'), 
(3, 'Esmero LTDA', '+55 (11)9 9724-8131', 'Rua Moema');

insert into produto values
(1, 1, 'arroz', 16.57, '2023-12-17'), 
(2,3, 'detergente', 3.97, '2037-08-23'), 
(3,2, 'calça', 184.91, '2045-01-27'), 
(4,3, 'desinfetante', 8.60, '2036-02-14'), 
(5,2, 'camisa', 48.99, '2043-04-03'), 
(6,1, 'feijão', 12.31, '2023-09-11'), 
(7,2, 'vestido', 89.99, '2041-05-16'), 
(8,1, 'leite', 4.28, '2023-10-03'),
(9,3, 'sabão', 1.85, '2035-03-05');

insert into estoque values
(1, '01.678.277/0109-87', 10), 
(2, '02.876.722/0202-55', 20), 
(3, '03.987.311/0302-45', 30), 
(4, '01.678.277/0109-87', 40), 
(5, '02.876.722/0202-55', 50), 
(6, '03.987.311/0302-45', 60), 
(7, '01.678.277/0109-87', 70);

insert into estoque(id_produto, cnpj_filial) values
(8, '02.876.722/0202-55'), (9, '03.987.311/0302-45');

insert into identificacao values
(1, 'parboilizado', 'pré-cozido'), (2, 'neutro', 'sem corante e aditivos'), (3, 'jeans', 'reta'), (4, 'cloro', 'bactericida'), (5, 'algodão', 'sem estampa'), (6, 'carioca', 'orgânico'), (7, 'algodão', 'estampado'), (8, 'integral', 'com vitaminas'), (9, 'barra', 'banho');

-- 1-a)
select p.nome as nome_produto, e.quantidade, p.preco * e.quantidade as total
from produto p join estoque e ON p.id = e.id_produto
order by total desc;

-- b)
select f.nome as nome_filial, sum(p.preco * e.quantidade) as total
from filial f join estoque e on f.cnpj = e.cnpj_filial join produto p on e.id_produto = p.id
group by f.nome
order by total desc;

