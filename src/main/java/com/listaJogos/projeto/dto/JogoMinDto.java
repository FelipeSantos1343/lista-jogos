package com.listaJogos.projeto.dto;

import com.listaJogos.projeto.models.Jogo;
import com.listaJogos.projeto.projections.JogoMinProjection;

import jakarta.persistence.Column;

public class JogoMinDto {
    private long id;
    private String titulo;
    private Integer ano;
    private String imagem;
    @Column(columnDefinition = "TEXT")
    private String descricaoCurta;

    public JogoMinDto(){
    }

    public JogoMinDto(Jogo jogo) {
        id = jogo.getId();
        titulo = jogo.getTitulo();
        ano = jogo.getAno();
        imagem = jogo.getImagem();
        descricaoCurta = jogo.getDescricaoCurta();
    }

    public JogoMinDto(JogoMinProjection projection) {
        id = projection.getId();
        titulo = projection.getTitulo();
        ano = projection.getAno();
        imagem = projection.getImagem();
        descricaoCurta = projection.getDescricaoCurta();
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getImagem() {
        return imagem;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }
}
