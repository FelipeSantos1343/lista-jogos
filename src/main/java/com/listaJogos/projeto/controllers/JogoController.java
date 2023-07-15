package com.listaJogos.projeto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.listaJogos.projeto.dto.JogoDto;
import com.listaJogos.projeto.dto.JogoMinDto;
import com.listaJogos.projeto.services.JogoService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class JogoController {
    @Autowired
    JogoService jogoService;

    @GetMapping("jogo/buscar")
    public List<JogoMinDto> buscarTodosJogos() {
        List<JogoMinDto> resultado = jogoService.findAll();
        return resultado;
    }

    @GetMapping("jogo/buscar/{id}")
    public JogoDto buscarUmJogo(@PathVariable(value = "id") Long id){
        JogoDto resultado = jogoService.findById(id);
        return resultado;
    }
}
