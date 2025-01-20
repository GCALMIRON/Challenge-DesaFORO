package com.alurachallenge.DesaFORO.domain.curso.dto;

import com.alurachallenge.DesaFORO.domain.curso.Categoria;
import com.alurachallenge.DesaFORO.domain.curso.Curso;

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