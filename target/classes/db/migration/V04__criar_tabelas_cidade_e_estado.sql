CREATE TABLE estado (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR (50) NOT NULL,
	sigla VARCHAR(2) NOT NULL
)ENGINE = InnoDB DEFAULT CHARSET = utf8;

CREATE TABLE cidade (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	codigo_estado BIGINT(20) NOT NULL,
	FOREIGN KEY (codigo_estado) REFERENCES estado(codigo)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

INSERT INTO estado (nome, sigla) VALUES ('Acre', 'AC');
INSERT INTO estado (nome, sigla) VALUES ('Bahia', 'BA');
INSERT INTO estado (nome, sigla) VALUES ('Ceará', 'CE');
INSERT INTO estado (nome, sigla) VALUES ('Amazonas', 'AM');
INSERT INTO estado (nome, sigla) VALUES ('Rio Grande do Norte', 'RN');
INSERT INTO estado (nome, sigla) VALUES ('Sergipe', 'SE');

INSERT INTO cidade (nome, codigo_estado) VALUES ('Fortaleza', 3);
INSERT INTO cidade (nome, codigo_estado) VALUES ('Natal', 5);
INSERT INTO cidade (nome, codigo_estado) VALUES ('Salvador', 2);
INSERT INTO cidade (nome, codigo_estado) VALUES ('Quixadá', 3);
INSERT INTO cidade (nome, codigo_estado) VALUES ('Manaus', 4);
INSERT INTO cidade (nome, codigo_estado) VALUES ('Itumbiara', 6);
INSERT INTO cidade (nome, codigo_estado) VALUES ('Novo Brasil', 2);
INSERT INTO cidade (nome, codigo_estado) VALUES ('Parnamirim', 5);
INSERT INTO cidade (nome, codigo_estado) VALUES ('Caucaia', 3);
INSERT INTO cidade (nome, codigo_estado) VALUES ('Montes Claros', 1);
INSERT INTO cidade (nome, codigo_estado) VALUES ('Maracanú', 3);
INSERT INTO cidade (nome, codigo_estado) VALUES ('Criciúma', 6);
INSERT INTO cidade (nome, codigo_estado) VALUES ('Pipa', 5);
INSERT INTO cidade (nome, codigo_estado) VALUES ('Lages', 1);
INSERT INTO cidade (nome, codigo_estado) VALUES ('Coqueiro', 6);
INSERT INTO cidade (nome, codigo_estado) VALUES ('Dinossauros', 1);
INSERT INTO cidade (nome, codigo_estado) VALUES ('Pedras', 1);




