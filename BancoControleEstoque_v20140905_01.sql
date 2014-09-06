-- Database: controle_estoque

-- DROP DATABASE controle_estoque;

CREATE DATABASE controle_estoque
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Portuguese_Brazil.1252'
       LC_CTYPE = 'Portuguese_Brazil.1252'
       CONNECTION LIMIT = -1;

	   
--------------------------------------------------------------


-- Table: produto

-- DROP TABLE produto;

CREATE TABLE produto
(
  cod_produto serial NOT NULL,
  cod_barras integer NOT NULL,
  nome character varying(50) NOT NULL,
  fabricante character varying(50) NOT NULL,
  modelo character varying(50) NOT NULL,
  CONSTRAINT produto_pkey PRIMARY KEY (cod_produto)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE produto
  OWNER TO postgres;

  
--------------------------------------------------------------


-- Table: estoque

-- DROP TABLE estoque;

CREATE TABLE estoque
(
  cod_estoque integer NOT NULL,
  cod_produto integer NOT NULL,
  qtd_produto integer,
  validade character varying(20),
  CONSTRAINT cod_estoque_produto_pkey PRIMARY KEY (cod_estoque, cod_produto),
  CONSTRAINT produto_estoque_fkey FOREIGN KEY (cod_produto)
      REFERENCES produto (cod_produto) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE estoque
  OWNER TO postgres;

  
------------------------------------------------------------------


-- Table: venda

-- DROP TABLE venda;

CREATE TABLE venda
(
  cod_venda serial NOT NULL,
  cod_produto integer NOT NULL,
  qtd_produto integer NOT NULL,
  CONSTRAINT cod_venda_pkey PRIMARY KEY (cod_venda),
  CONSTRAINT produto_venda_fkey FOREIGN KEY (cod_produto)
      REFERENCES produto (cod_produto) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE venda
  OWNER TO postgres;
