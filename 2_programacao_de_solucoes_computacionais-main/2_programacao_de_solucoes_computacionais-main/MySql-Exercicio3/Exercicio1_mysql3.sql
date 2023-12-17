-- a)
select prod.id, prod.nome, id.descricao, prod.preco
from produto as prod, identificacao as id
where prod.id = id.id order by preco desc;

 -- b)
select prod.id, prod.nome, id.descricao, prod.preco
from produto as prod, identificacao as id
where prod.id = id.id order by nome asc, preco desc;
 
 -- c)
select i.nome as NomeIdentificacao from identificacao i join produto p
on i.id = p.id
group by i.nome;

 -- d)
select i.nome as NomeIdentificacao, sum(p.preco) as soma from identificacao i join produto p
on i.id = p.id
group by i.nome;

 -- e)
select i.nome as NomeIdentificacao, avg(p.preco) as media from identificacao i join produto p
on i.id = p.id
group by i.nome;

 -- f)
select i.nome as NomeIdentificacao, sum(p.preco) as soma from identificacao i join produto p
on i.id = p.id
group by i.nome having sum(p.preco) > 100.0;
