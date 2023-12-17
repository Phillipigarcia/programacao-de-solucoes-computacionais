create schema if not exists gestao;
CREATE TABLE clientes (
    CPF VARCHAR(15) PRIMARY KEY,
    nome VARCHAR(100),
    data_nascimento DATE,
    agencia VARCHAR(10),
    conta VARCHAR(20),
    telefone VARCHAR(15),
    endereco VARCHAR(100),
    perfil VARCHAR(20)
);

CREATE TABLE Ativos (
    id INT PRIMARY KEY,
    nome VARCHAR(100),
    descricao VARCHAR(255),
    emissor VARCHAR(100),
    data_inicio DATE,
    data_fim DATE
);

CREATE TABLE Corretagem (
    id INT PRIMARY KEY,
    data_compra DATE,
    CPF_cliente VARCHAR(11),
    codigo_ativo INT,
    quantidade INT,
    cotacao DECIMAL(10, 2),
    valor_compra DECIMAL(15, 2),
    FOREIGN KEY (CPF_cliente) REFERENCES clientes(CPF),
    FOREIGN KEY (codigo_ativo) REFERENCES Ativos(id)
);

INSERT INTO clientes (CPF, nome, data_nascimento, agencia, conta, telefone, endereco, perfil)
VALUES ('12345678901', 'Cliente Exemplo', '1990-01-01', '001', '12345-6', '(11) 1234-5678', 'Rua Exemplo, 123', 'Moderado');

SELECT * FROM clientes;

UPDATE clientes SET telefone = '(11) 9876-5432' WHERE CPF = '12345678901';

DELETE FROM clientes WHERE CPF = '12345678901';

