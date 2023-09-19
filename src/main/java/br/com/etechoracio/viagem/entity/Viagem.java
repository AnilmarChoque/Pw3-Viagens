package br.com.etechoracio.viagem.entity;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/*CREATE TABLE TBL_VIAGEM(
         ID_VIAGEM BIGINT PRIMARY KEY IDENTITY,
         TX_DESTINO VARCHAR(30) NOT NULL,
         TP_VIAGEM VARCHAR(8) NOT NULL,
         DT_CHEGADA DATE NOT NULL,
         DT_SAIDA DATE,
         VLR_ORCAMENTO FLOAT NOT NULL,
         QTD_PESSOAS INT
);
*/
@Getter
@Setter
@Entity
@Table(name = "TBL_VIAGEM")
public class Viagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_VIAGEM")
    private Long id;

    @Column(name = "TX_DESTINO")
    private String destino;

    @Column(name = "TP_VIAGEM")
    private String tipoViagem;

    @Column(name = "DT_CHEGADA")
    private LocalDate dataChegada;

    @Column(name = "DT_SAIDA")
    private LocalDate dataSaida;

    @Column(name = "VLR_ORCAMENTO")
    private double valorOrcamento;

    @Column(name = "QTD_PESSOAS")
    private Integer quantidadeDePessoas;
}
