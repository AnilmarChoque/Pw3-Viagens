CREATE TABLE TBL_GASTO (
         ID_GASTO BIGINT PRIMARY KEY IDENTITY,
         TX_DESCRICAO VARCHAR(30) NOT NULL,
         TX_LOCAL VARCHAR(20) NOT NULL,
         TP_CATEGORIA VARCHAR(11) NOT NULL,
         DT_GASTO DATE NOT NULL,
         VLR_GASTO FLOAT NOT NULL,
         ID_VIAGEM BIGINT NOT NULL,
         FOREIGN KEY (ID_VIAGEM) REFERENCES TBL_VIAGEM(ID_VIAGEM)
);

INSERT INTO TBL_GASTO (TX_DESCRICAO, TX_LOCAL, TP_CATEGORIA, DT_GASTO, VLR_GASTO, ID_VIAGEM) VALUES ('Almoço', 'Gringo Burgers', 'ALIMENTACAO', '2022-04-12', 40, 1);
INSERT INTO TBL_GASTO (TX_DESCRICAO, TX_LOCAL, TP_CATEGORIA, DT_GASTO, VLR_GASTO, ID_VIAGEM) VALUES ('Abastecimento', 'Posto Shell', 'COMBUSTIVEL', '2022-04-12', 90, 1);
INSERT INTO TBL_GASTO (TX_DESCRICAO, TX_LOCAL, TP_CATEGORIA, DT_GASTO, VLR_GASTO, ID_VIAGEM) VALUES ('Excursão à Arraial dAjuda', 'Decolar', 'OUTROS', '2022-04-13', 110, 1);
INSERT INTO TBL_GASTO (TX_DESCRICAO, TX_LOCAL, TP_CATEGORIA, DT_GASTO, VLR_GASTO, ID_VIAGEM) VALUES ('Mergulho', 'Decolar', 'OUTROS', '2022-04-14', 307, 1);
