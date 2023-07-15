package com.listaJogos.projeto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.listaJogos.projeto.dto.JogoListDto;
import com.listaJogos.projeto.services.JogoListService;

@RestController
@CrossOrigin
@RequestMapping("/jogos")
public class JogoListController {
    @Autowired
    JogoListService jogoListService;

    @GetMapping("/buscarLista")
    public List<JogoListDto> buscarTodasListas(){
        return jogoListService.findAll();
    }
}
