package com.alurachallenge.DesaFORO.domain.respuesta.validaciones.create;

import com.alurachallenge.DesaFORO.domain.respuesta.dto.CrearRespuestaDTO;
import com.alurachallenge.DesaFORO.domain.topico.Estado;
import com.alurachallenge.DesaFORO.domain.topico.repositorio.TopicoRepositorio;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RespuestaTopicoValida implements ValidarRespuestaCreada{

    @Autowired
    private TopicoRepositorio repository;

    @Override
    public void validate(CrearRespuestaDTO data) {
        var topicoExiste = repository.existsById(data.topicoId());

        if (!topicoExiste){
            throw new ValidationException("Este topico no existe.");
        }

        var topicoAbierto = repository.findById(data.topicoId()).get().getEstado();

        if(topicoAbierto != Estado.OPEN){
            throw new ValidationException("Este topico no esta abierto.");
        }

    }
}