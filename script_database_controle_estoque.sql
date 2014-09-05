----------------------------------------------------------------------------------------
----------- [ CRIANDO BANCO ] --------------------------------------------------------
----------------------------------------------------------------------------------------

create database controle_estoque;
use controle_estoque;

----------------------------------------------------------------------------------------
----------- [ CRIANDO TABELAS ] --------------------------------------------------------
----------------------------------------------------------------------------------------

/*Cria tabela para cadastro de produtos*/
CREATE TABLE produto (
  cod_produto SERIAL NOT NULL,
  cod_barras int NOT NULL,
  nome varchar(50) NOT NULL,
  fabricante varchar(50) NOT NULL,
  modelo varchar(50) NOT NULL,
  CONSTRAINT produto_pkey PRIMARY KEY (cod_produto)
);


/*Cria tabela para cadastro estoques*/
CREATE TABLE estoque (
  cod_estoque int NOT NULL,
  cod_produto int NOT NULL,
  qtd_produto int NOT NULL,
  validade date NOT NULL,
  CONSTRAINT cod_estoque_produto_pkey PRIMARY KEY (cod_estoque, cod_produto),
  CONSTRAINT produto_estoque_fkey FOREIGN KEY (cod_produto) REFERENCES produto (cod_produto)
);


/*Cria tabela para cadastro de movimento de vendas de produtos*/
CREATE TABLE venda (
  cod_venda SERIAL NOT NULL,
  cod_produto int NOT NULL,
  qtd_produto int NOT NULL,
  CONSTRAINT cod_venda_pkey PRIMARY KEY (cod_venda),
  CONSTRAINT produto_venda_fkey FOREIGN KEY (cod_produto) REFERENCES produto (cod_produto)
);