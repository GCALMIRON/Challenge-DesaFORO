package com.alurachallenge.DesaFORO.domain.respuesta.validaciones.update;

import com.alurachallenge.DesaFORO.domain.respuesta.dto.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}
