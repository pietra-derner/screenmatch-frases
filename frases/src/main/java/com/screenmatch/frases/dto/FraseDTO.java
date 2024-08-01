package com.screenmatch.frases.dto;

import com.screenmatch.frases.model.Serie;

public record FraseDTO (String titulo,
                        String personagem,
                        String poster,
                        Serie serie) {
}
