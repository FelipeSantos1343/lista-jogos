package com.listaJogos.projeto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.listaJogos.projeto.dto.JogoDto;
import com.listaJogos.projeto.services.JogoService;

@RestController
@CrossOrigin
@RequestMapping("/jogos")
public class JogoController {
    @Autowired
    JogoService jogoService;

    @GetMapping("/buscar")
    public List<JogoDto> buscarTodosJogos(){
        List<JogoDto> resultado = jogoService.findAll();
        return resultado;
    }
}
