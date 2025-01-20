package com.alurachallenge.DesaFORO.domain.topico.dto;

import com.alurachallenge.DesaFORO.domain.topico.Estado;

public record ActualizarTopicoDTO (
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
){
}
