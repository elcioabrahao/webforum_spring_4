CREATE DATABASE webforum;

USE webforum;

CREATE TABLE forum_cliente (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  nome varchar(255) DEFAULT NULL,
  cpf varchar(255) DEFAULT NULL,
  telefone varchar(255) DEFAULT NULL,
  email varchar(255) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY forum_cliente_id_INDEX (id)
);

CREATE TABLE forum_mensagem (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  id_cliente bigint(20) DEFAULT NULL,
  nome_cliente varchar(255) DEFAULT NULL,
  data varchar(255) DEFAULT NULL,
  mensagem varchar(255) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY forum_mensagem_id_INDEX (id)
);
