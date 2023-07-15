package com.listaJogos.projeto.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class PertencimentoPk {
    @ManyToOne
    @JoinColumn(name = "jogo_id")
    private Jogo jogo;
    @ManyToOne
    @JoinColumn(name = "lista_id")
    private JogoList jogoList;
    
    public PertencimentoPk(){
    }

    public PertencimentoPk(Jogo jogo, JogoList jogoList){
        this.jogo = jogo;
        this.jogoList = jogoList;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public JogoList getJogoList() {
        return jogoList;
    }

    public void setJogoList(JogoList jogoList) {
        this.jogoList = jogoList;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((jogo == null) ? 0 : jogo.hashCode());
        result = prime * result + ((jogoList == null) ? 0 : jogoList.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PertencimentoPk other = (PertencimentoPk) obj;
        if (jogo == null) {
            if (other.jogo != null)
                return false;
        } else if (!jogo.equals(other.jogo))
            return false;
        if (jogoList == null) {
            if (other.jogoList != null)
                return false;
        } else if (!jogoList.equals(other.jogoList))
            return false;
        return true;
    }

    

    
}
