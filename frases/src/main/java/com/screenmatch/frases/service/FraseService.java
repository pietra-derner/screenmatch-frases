package com.screenmatch.frases.service;

import com.screenmatch.frases.dto.FraseDTO;
import com.screenmatch.frases.model.Frase;
import com.screenmatch.frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(),
                frase.getPersonagem(), frase.getPoster());
    }

}
