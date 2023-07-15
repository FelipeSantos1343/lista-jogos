package com.listaJogos.projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.listaJogos.projeto.dto.JogoDto;
import com.listaJogos.projeto.models.Jogo;
import com.listaJogos.projeto.repositorys.JogoRepository;

@Service
public class JogoService {
    
    @Autowired
    JogoRepository jogoRepository;

    public List<JogoDto> findAll(){
        List<Jogo> resultado = jogoRepository.findAll();
        List<JogoDto> dtos = resultado.stream().map(j -> new JogoDto(j)).toList();
        return dtos;
    }
}
