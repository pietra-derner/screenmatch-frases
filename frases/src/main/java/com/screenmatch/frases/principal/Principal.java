package com.screenmatch.frases.principal;

import com.screenmatch.frases.model.Frase;
import com.screenmatch.frases.repository.FraseRepository;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    private FraseRepository repositorio;
    private List<Frase> frases = new ArrayList<>();

    public Principal(FraseRepository repositorio){
        this.repositorio = repositorio;
    }
}
