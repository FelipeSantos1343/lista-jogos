package com.listaJogos.projeto.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pertencimento")
public class Pertencimento {
    @EmbeddedId
    private PertencimentoPk id = new PertencimentoPk();
    private Integer posicao;

    public Pertencimento(){
    }

    public Pertencimento(Jogo jogo, JogoList jogoList, Integer posicao) {
        id.setJogo(jogo);
        id.setJogoList(jogoList);
        this.posicao = posicao;
    }

    public PertencimentoPk getId() {
        return id;
    }

    public void setId(PertencimentoPk id) {
        this.id = id;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    
}
