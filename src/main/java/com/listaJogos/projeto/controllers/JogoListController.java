package com.listaJogos.projeto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.listaJogos.projeto.dto.JogoListDto;
import com.listaJogos.projeto.dto.JogoMinDto;
import com.listaJogos.projeto.services.JogoListService;
import com.listaJogos.projeto.services.JogoService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class JogoListController {
    @Autowired
    JogoListService jogoListService;

    @Autowired
    JogoService jogoService;

    @GetMapping("lista/buscar")
    public List<JogoListDto> buscarTodasListas(){
        return jogoListService.findAll();
    }

    @GetMapping("lista/buscarJogo/{id}")
    public List<JogoMinDto> buscarTodasJogosDaListas(@PathVariable(value = "id") Long listId){
        return jogoService.findByList(listId);
    }
}
