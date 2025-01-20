package com.alurachallenge.DesaFORO.domain.curso.dto;

import com.alurachallenge.DesaFORO.domain.curso.Categoria;

public record ActualizarCursoDTO(
        String name,
        Categoria categoria,
        Boolean activo) {
}