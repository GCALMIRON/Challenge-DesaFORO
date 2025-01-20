package com.alurachallenge.DesaFORO.domain.respuesta.validaciones.create;

import com.alurachallenge.DesaFORO.domain.respuesta.dto.CrearRespuestaDTO;
import com.alurachallenge.DesaFORO.domain.usuario.repositorio.UsuarioRepositorio;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RespuestaUsuarioValida implements ValidarRespuestaCreada{

    @Autowired
    private UsuarioRepositorio repository;

    @Override
    public void validate(CrearRespuestaDTO data) {
        var usuarioExiste = repository.existsById(data.usuarioId());

        if(!usuarioExiste){
            throw new ValidationException("Este usuario no existe");
        }

        var usuarioHabilitado = repository.findById(data.usuarioId()).get().isEnabled();

        if(!usuarioHabilitado){
            throw new ValidationException("Este usuario no esta habilitado");
        }
    }
}
