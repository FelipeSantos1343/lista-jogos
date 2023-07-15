package com.listaJogos.projeto.projections;

public interface JogoMinProjection {
    Long getId();
    String getTitulo();
    Integer getAno();
    String getImagem();
    String getDescricaoCurta();
    Integer getPosicao();
}
