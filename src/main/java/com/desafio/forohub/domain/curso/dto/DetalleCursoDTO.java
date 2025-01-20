package com.desafio.forohub.domain.curso.dto;

import com.desafio.forohub.domain.curso.Categoria;
import com.desafio.forohub.domain.curso.Curso;

public record DetalleCursoDTO(
        Long id,
        String name,
        Categoria categoria,
        Boolean activo) {

    public DetalleCursoDTO(Curso curso){
        this(
                curso.getId(),
                curso.getName(),
                curso.getCategoria(),
                curso.getActivo());
    }

}
