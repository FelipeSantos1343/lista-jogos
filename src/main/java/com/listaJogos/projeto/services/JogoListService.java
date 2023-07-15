package com.listaJogos.projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.listaJogos.projeto.dto.JogoListDto;
import com.listaJogos.projeto.models.JogoList;
import com.listaJogos.projeto.repositorys.JogoListRepository;



@Service
public class JogoListService {
    @Autowired
    JogoListRepository jogoListRepository;
    
    @Transactional
    public List<JogoListDto> findAll(){
        List<JogoList> resultado = jogoListRepository.findAll();
        List<JogoListDto> dtos = resultado.stream().map(l -> new JogoListDto(l)).toList();
        return dtos;
    }
}
