package com.screenmatch.frases.controller;

import com.screenmatch.frases.dto.FraseDTO;
import com.screenmatch.frases.dto.SerieDTO;
import com.screenmatch.frases.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {
    @Autowired
    private SerieService servico;

    @GetMapping
    public List<SerieDTO> obterSeries(){
        return servico.obterTodasAsSeries();
    }

    @GetMapping("/frases")
    public List<FraseDTO> obterFrases(){
        return servico.obterFraseAleatoria();
    }
}
