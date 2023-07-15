package com.listaJogos.projeto.dto;

import com.listaJogos.projeto.models.Jogo;

import jakarta.persistence.Column;

public class JogoDto {
    private long id;
    private String titulo;
    private Integer ano;
    private String imagem;
    @Column(columnDefinition = "TEXT")
    private String descricaoCurta;

    public JogoDto(){
    }

    public JogoDto(Jogo jogo) {
        id = jogo.getId();
        titulo = jogo.getTitulo();
        ano = jogo.getAno();
        imagem = jogo.getImagem();
        descricaoCurta = jogo.getDescricaoCurta();
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
