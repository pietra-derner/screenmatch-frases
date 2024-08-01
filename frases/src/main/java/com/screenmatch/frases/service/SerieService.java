package com.screenmatch.frases.service;

import com.screenmatch.frases.dto.FraseDTO;
import com.screenmatch.frases.dto.SerieDTO;
import com.screenmatch.frases.model.Serie;
import com.screenmatch.frases.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SerieService {
    @Autowired
    private SerieRepository repositorio;

    private List<SerieDTO> converteDadosDTO(List<Serie> series) {
        return series.stream()
                .map(s -> new SerieDTO(s.getId(), s.getTitulo()))
                .collect(Collectors.toList());
    }

    public List<SerieDTO> obterTodasAsSeries() {
        return converteDadosDTO(repositorio.findAll());
    }

//    public List<FraseDTO> obterFraseAleatoria() {
//        return converteDadosDTO(repositorio.findAll());
//    }
}
