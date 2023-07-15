package com.listaJogos.projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.listaJogos.projeto.dto.JogoDto;
import com.listaJogos.projeto.dto.JogoMinDto;
import com.listaJogos.projeto.models.Jogo;
import com.listaJogos.projeto.projections.JogoMinProjection;
import com.listaJogos.projeto.repositorys.JogoRepository;



@Service
public class JogoService {
    
    @Autowired
    JogoRepository jogoRepository;

    @Transactional(readOnly = true)
    public List<JogoMinDto> findAll(){
        List<Jogo> resultado = jogoRepository.findAll();
        List<JogoMinDto> dtos = resultado.stream().map(j -> new JogoMinDto(j)).toList();
        return dtos;
    }

    @Transactional(readOnly = true)
    public JogoDto findById(Long id){
        Jogo resultado = jogoRepository.findById(id).get();
        return new JogoDto(resultado);
    }

    @Transactional(readOnly = true)
    public List<JogoMinDto> findByList(Long listId){
        List<JogoMinProjection> resultado = jogoRepository.searchByList(listId);
        List<JogoMinDto> dtos = resultado.stream().map(j -> new JogoMinDto(j)).toList();
        return dtos;
    }
}
