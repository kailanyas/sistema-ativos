package broker.model;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Ativo {
    private String codigo;
    private String nome;
    private BigDecimal valorAtual;
    private LocalDate dataUltimaAtualizacao;


    public Ativo(String codigo, String nome, BigDecimal valorAtual, LocalDate dataUltimaAtualizacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorAtual = valorAtual;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }


    public String getCodigo() {
        return codigo;
    }


    public String getNome() {
        return nome;
    }


    public BigDecimal getValorAtual() {
        return valorAtual;
    }


    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }
}