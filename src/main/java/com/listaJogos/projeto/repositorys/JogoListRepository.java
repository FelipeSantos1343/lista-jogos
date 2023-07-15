package com.listaJogos.projeto.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.listaJogos.projeto.models.JogoList;

@Repository
public interface JogoListRepository extends JpaRepository<JogoList, Long>{
    
}
