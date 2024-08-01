package com.screenmatch.frases.principal;

import com.screenmatch.frases.model.Serie;
import com.screenmatch.frases.repository.SerieRepository;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    private SerieRepository repositorio;
    private List<Serie> series = new ArrayList<>();

    public Principal(SerieRepository repositorio){
        this.repositorio = repositorio;
    }
}
