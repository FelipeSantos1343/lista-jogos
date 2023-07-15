package com.listaJogos.projeto.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.listaJogos.projeto.models.Jogo;
@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long>{
    
}
