package com.screenmatch.frases.model;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String frase;
    private String poster;
    private String personagem;
    @ManyToOne
    private Serie serie;
}
