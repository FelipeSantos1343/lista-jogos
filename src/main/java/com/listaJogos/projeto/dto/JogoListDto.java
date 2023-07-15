package com.listaJogos.projeto.dto;

import com.listaJogos.projeto.models.JogoList;

public class JogoListDto {
    private Long id;
    private String nome;

    JogoListDto(){
    }

    public JogoListDto(JogoList jogoList) {
        id = jogoList.getId();
        nome = jogoList.getName();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
}
